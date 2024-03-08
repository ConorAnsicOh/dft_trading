package com.dft.trading.account.io;

import java.util.Date;


public class SgnSingIO {

	private String userId;
	private String userPw;
	private String userEmail;
	private String userNm;
	private String userNnm;
	private String userState;
	private String userDv;
	private Date   lstUdtDt;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	} 
	public String setUserPw(String userPw) {
		return this.userPw = userPw;
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
	@Override
	public String toString() {
		return "SngUpIO [userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail + ", userNm=" + userNm
				+ ", userNnm=" + userNnm + ", userDv=" + userDv + ", lstUdtDt=" + lstUdtDt + "]";
	}
	
}
