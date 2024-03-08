package com.dft.trading.common.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.service.LogLognBMO;


@Repository
public class LogLognCMO {

	@Autowired
	private LogLognBMO logLognBMO;
	
	public List<LogLognIO> SelectLogLognId(String userEmail, String userNm) {
		
		return logLognBMO.SelectLogLognId(userEmail, userNm);
	}
	
	public List<LogLognIO> SelectLogLognPwd(String userId) {
		
		return logLognBMO.SelectLogLognPwd(userId);
	}
	
	public List<LogLognIO> SelectLogLognAll(String userId, String userPwd, HttpServletRequest request) throws Exception {
		
		return logLognBMO.SelectLogLognAll(userId, userPwd, request);
	}
}
 