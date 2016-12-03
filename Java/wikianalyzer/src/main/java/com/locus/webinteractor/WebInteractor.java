package com.locus.webinteractor;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
/**
 * This class interact with jsoup API
 * @author prashant
 *
 */
public class WebInteractor {

	/**
	 * interact with jsoup which fetch webpage content in Document form
	 * @param page_URL
	 * @return pagecontentDOC
	 */
	public Document getWebPage(String page_URL) {
		Document doc=null;
		try {
			doc=Jsoup.connect(page_URL).get();
		}
		catch (IOException e) {
			System.out.println("unable to reach page:"+page_URL);
			doc=null;
		} catch(Exception e){
			doc=null;
		}
		return doc;
	}

}

