package com.dft.trading.account.dao;

import java.util.List;

import com.dft.trading.account.io.LonLognIO;


public interface LonLognDMO {

	List<LonLognIO> getAllUserInfo();
	
	List<LonLognIO> getUserInfoByUserId(String userId, String userPwd);
}
