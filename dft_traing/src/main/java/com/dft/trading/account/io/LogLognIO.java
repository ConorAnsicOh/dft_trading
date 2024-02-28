package com.dft.trading.account.io;

import java.sql.Date;

import lombok.Data;

@Data
public class LogLognIO {
	private String userId;
	private String userPwd;
	private String userEmail;
	private String userNm;
	private String userNnm;
	private String userState;
	private String userDv;
	private Date lstUdtDt;
}
