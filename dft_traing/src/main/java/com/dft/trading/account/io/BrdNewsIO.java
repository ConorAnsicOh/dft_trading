package com.dft.trading.account.io;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
//@Getter @Setter
public class BrdNewsIO {
	
	private String newsId;
	private String newsLink;
	private String newsTitle;
	private String newsImage;
	private String newsDetail;
	private String newsCom;
	private Date   newsTime;
	private int    newsCount;
	
	
	public int getNewsCount() {
		return newsCount;
	}
	public void setNewsCount(int newsCount) {
		this.newsCount = newsCount;
	}

	public String getNewsId() {
		return newsId;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	public String getNewsLink() {
		return newsLink;
	}
	public void setNewsLink(String newsLink) {
		this.newsLink = newsLink;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsImage() {
		return newsImage;
	}
	public void setNewsImage(String newsImage) {
		this.newsImage = newsImage;
	}
	public String getNewsDetail() {
		return newsDetail;
	}
	public void setNewsDetail(String newsDetail) {
		this.newsDetail = newsDetail;
	}
	public String getNewsCom() {
		return newsCom;
	}
	public void setNewsCom(String newsCom) {
		this.newsCom = newsCom;
	}
	public Date getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(Date newsTime) {
		this.newsTime = newsTime;
	}
}