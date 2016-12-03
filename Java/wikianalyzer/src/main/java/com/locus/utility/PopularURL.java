package com.locus.utility;
/**
 * to store popular url and its popularity count
 * @author prashant
 *
 */
public class PopularURL {
	private String url;
	private int popularity_Count;
	
	public PopularURL() {
		url=null;
		popularity_Count=0;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPopularity_Count() {
		return popularity_Count;
	}
	public void setPopularity_Count(int popularity_Count) {
		this.popularity_Count = popularity_Count;
	}
}
