package com.dft.trading.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dft.trading.account.dao.LogLognDMO;
import com.dft.trading.account.io.LogLognIO;

@Service
public class LogLognBMC implements LogLognBMO {
	
	@Autowired
	private LogLognDMO userInfoDMO;	

	@Override
	public List<LogLognIO> getAllUserInfo() {
		System.out.println("************************** BMC >>> getAllUserInfo!!");
		return userInfoDMO.getAllUserInfo();
		
	}

	@Override
	public List<LogLognIO> getUserInfoByUserId(String userId, String userPwd) {
		System.out.println("************************** BMC >>> getUserInfoByUserId!!");
		return userInfoDMO.getUserInfoByUserId(userId, userPwd);
	}
}
