package com.dft.trading.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.service.LogLognBMO;

@Repository
public class LogLognCMO {

	@Autowired
	private LogLognBMO logLognBMO;
	
	public List<LogLognIO> getUserInfoByUserId(String userEmail, String userNm) {
		
		return logLognBMO.getUserInfoByUserId(userEmail, userNm);
	}
}
