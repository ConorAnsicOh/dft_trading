package com.dft.trading.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.service.LogLognBMO;

@Repository
public class LogLognCMO {

	@Autowired
	private LogLognBMO lonLognBMO;
	
	public List<LogLognIO> getUserInfoByUserId(String userId, String userPwd) {
		
		return lonLognBMO.getUserInfoByUserId(userId, userPwd);
	}
}
