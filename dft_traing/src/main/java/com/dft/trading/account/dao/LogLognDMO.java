package com.dft.trading.account.dao;

import java.util.List;

import com.dft.trading.account.io.LogLognIO;


public interface LogLognDMO {

	List<LogLognIO> getAllUserInfo();
	
	List<LogLognIO> getUserInfoByUserId(String userId, String userPwd);
}
