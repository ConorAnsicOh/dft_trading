package com.dft.trading.account.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dft.trading.account.io.LogLognIO;


public interface LogLognBMO {

	List<LogLognIO> SelectLogLognId(String userEmail, String userNm);
	
	List<LogLognIO> SelectLogLognPwd(String userId);

	List<LogLognIO> SelectLogLognNm(String userId, String userPwd, HttpServletRequest request) throws Exception;
}
 