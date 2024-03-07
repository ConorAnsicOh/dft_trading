package com.dft.trading.account.io;

import java.util.Date;


public class LogLognIO {
	private String userId;
	private String userPwd;
	private String userEmail;
	private String userNm;
	private String userNnm;
	private String userState;
	private String userDv;
	private String salt;
	private Date lstUdtDt;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String setUserPwd(String userPwd) {
		return this.userPwd = userPwd;
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
	
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Date getLstUdtDt() {
		return lstUdtDt;
	}
	public void setLstUdtDt(Date lstUdtDt) {
		this.lstUdtDt = lstUdtDt;
	}
	@Override
	public String toString() {
		return "LogLognIO [userId=" + userId + ", userPwd=" + userPwd + ", userEmail=" + userEmail + ", userNm="
				+ userNm + ", userNnm=" + userNnm + ", userState=" + userState + ", userDv=" + userDv + ", salt=" + salt
				+ ", lstUdtDt=" + lstUdtDt + "]";
	}

	
}
