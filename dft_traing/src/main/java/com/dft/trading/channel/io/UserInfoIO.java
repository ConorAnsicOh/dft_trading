package com.dft.trading.channel.io;

import java.sql.Date;

import lombok.Data;

@Data
public class UserInfoIO {
	private String userId;
	private String userPwd;
	private String userEmail;
	private String userNm;
	private String userNnm;
	private String userState;
	private String userDv;
	private Date lstUdtDt;
}
