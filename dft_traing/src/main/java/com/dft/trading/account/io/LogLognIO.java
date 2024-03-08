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
	private String userImage;
	
	
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserNnm() {
		return userNnm;
	}
	public void setUserNnm(String userNnm) {
		this.userNnm = userNnm;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserDv() {
		return userDv;
	}
	public void setUserDv(String userDv) {
		this.userDv = userDv;
	}
	public Date getLstUdtDt() {
		return lstUdtDt;
	}
	public void setLstUdtDt(Date lstUdtDt) {
		this.lstUdtDt = lstUdtDt;
	}
	
	
}
