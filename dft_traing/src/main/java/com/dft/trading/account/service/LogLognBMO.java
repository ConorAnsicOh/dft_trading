package com.dft.trading.account.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;

public interface LogLognBMO {

	List<LogLognIO> getAllUserInfo();

	List<LogLognIO> getUserInfoByUserId(String userId, String userPwd);
	
}
