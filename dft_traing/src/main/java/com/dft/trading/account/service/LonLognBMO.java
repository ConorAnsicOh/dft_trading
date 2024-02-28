package com.dft.trading.account.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LonLognIO;

@Repository
public interface LonLognBMO {

	List<LonLognIO> getAllUserInfo();

	List<LonLognIO> getUserInfoByUserId(String userId, String userPwd);
	
}
