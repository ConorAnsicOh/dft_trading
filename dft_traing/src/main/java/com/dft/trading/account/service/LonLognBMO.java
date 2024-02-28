package com.dft.trading.account.service;

import java.util.List;

import com.dft.trading.account.io.LonLognIO;


public interface LonLognBMO {

	List<LonLognIO> getAllUserInfo();

	List<LonLognIO> getUserInfoByUserId(String userId, String userPwd);
	
}
