package com.dft.trading.account.io;

import java.util.Date;

import lombok.Data;

@Data
public class BrdNewsIO {

	private String NEWS_ID;
	private String NEWS_LINK;
	private String NEWS_TITLE;
	private String NEWS_IMAGE;
	private String NEWS_DETAIL;
	private String NEWS_COM;
	private Date   NEWS_TIME;
}