package com.locus.utility;

import java.util.HashSet;
import java.util.Iterator;

import com.locus.webinteractor.WebInteractor;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;

import com.locus.utility.PopularURL;

/**
 * This class inputs a URL and outputs the one(url(s)) which is most popular link within it. 
 * Popularity of the link is defined as the number of pages within the page that link to it. 
 * @author prashant
 *
 */
public class LinkAnalyzer {
	private WebInteractor webInteractor=null;
	private PopularURL popularURLobj = null;
	private Scanner input = null;
	
	private void initialize(){
		input = new Scanner(System.in);
		webInteractor = new WebInteractor();
		popularURLobj = new PopularURL();
	}
	public String getMostPopularLink(String page_URL) {
		initialize();
		analyzePage(page_URL);
		return popularURLobj.getUrl();
	}

	/**
	 * getURLs() this will return all set of specified web url present in the page
	 * processURLs() this will process the collected urls
	 * @param page_URL
	 */
	private void analyzePage(String page_URL) {

		HashSet<String> URL_set = null;
		URL_set = getURLs(page_URL);

		if (URL_set != null) {
			processURLs(URL_set);
		}
	}

	/**
	 * This function will get total links present inside current link(while
	 * iterating) and keep track of most popular one Also ask to process
	 * unprocessed links
	 * 
	 * @param URL_set
	 */
	private void processURLs(HashSet<String> URL_set) {
		int linkCount;
		int urlCount = URL_set.size();
		int iterationCount = 0;

		String popularURL = popularURLobj.getUrl();
		int maxURLcount = popularURLobj.getPopularity_Count();

		System.out.println(urlCount + " links found within page");
		while (true) {
			// take care of concurrent modification exception
			for (Iterator<String> iterator = URL_set.iterator(); iterator
					.hasNext();) {
				String page_URL = iterator.next();
				linkCount = getURLsCount(page_URL);

				if (linkCount > maxURLcount) {
					maxURLcount = linkCount;
					popularURL = page_URL;
				} else if (linkCount == maxURLcount) {
					popularURL = popularURL.concat(",\n" + page_URL);
				}
				if (linkCount >= 0) {
					System.out.println(++iterationCount + "/" + urlCount
							+ " links analyzed  " + linkCount + " --> "
							+ page_URL);
					iterator.remove();
				}
			}
			int remurlCount=URL_set.size();
			//urlCount = URL_set.size();
			if (remurlCount > 0) {
				System.out
						.println(remurlCount
								+ " links have not been analyzed, do you want to process them now "
								+ "to refine result? 1.Yes 2.No");
				try {
					int userInput = input.nextInt();
					if (userInput == 1) {
						continue;
					} else
						break;
				} catch (Exception e) {
					//illegal argument
					break;
				}
			} else
				break;
		}
		popularURLobj.setUrl(popularURL);
		popularURLobj.setPopularity_Count(maxURLcount);
	}

	/**
	 * calls htmlParser() to get list of all urls present in the page
	 * corresponding to webpage to the url
	 * @param page_URL
	 * @return urlset
	 */
	private HashSet<String> getURLs(String page_URL) {
		HashSet<String> urlSet = null;
		urlSet = htmlParser(page_URL);
		return urlSet;
	}

	
	private int getURLsCount(String page_URL) {
		HashSet<String>urlset=getURLs(page_URL);
		if(urlset==null) return 0;
		return urlset.size();
	}

	/**
	 * this will parse an html file and get a HashSet of all links, refine
	 * them(fwd only specified web links) returns set of unique urls
	 * @param page_URL
	 * @return urlset
	 */
	private HashSet<String> htmlParser(String page_URL) {
		Document doc = null;
		HashSet<String> urlSet = null;
		doc = webInteractor.getWebPage(page_URL);
		if (doc != null) {
			urlSet = getLinks(doc);
			if (urlSet != null)
				urlSet = refineURLs(urlSet);
		}
		return urlSet;
	}

	
	/**
	 * this will obtain absolute links inside <a></a> tag return set of unique
	 * urls
	 * @param doc
	 * @return urlset
	 */
	private HashSet<String> getLinks(Document doc) {
		HashSet<String> linkSet = new HashSet<String>();
		Elements links = doc.select("a[href]");
		for (Element link : links) {
			linkSet.add(link.attr("abs:href"));
		}
		return linkSet;
	}
	private HashSet<String> refineURLs(HashSet<String> urlSet){
		String domain=Constants.webDomain();
		if(domain==""||domain==null)
			return urlSet;
		return refine(urlSet);
	}

	/**
	 * This will refine the list of urls by removing all non specified web urls
	 * @param urlSet
	 * @return refinedURLset
	 */
	private HashSet<String> refine(HashSet<String> urlSet) {
		// concurrent modification exception is to be taken care
		String websiteDomain = Constants.webDomain();
		String url=null;
		for (Iterator<String> iterator = urlSet.iterator(); iterator.hasNext();) {
			 url=iterator.next();
			//one way to know the page is specified web page or not
			if (!url.contains(websiteDomain)) {
				iterator.remove();
			}
		}
		return urlSet;
	}

}
