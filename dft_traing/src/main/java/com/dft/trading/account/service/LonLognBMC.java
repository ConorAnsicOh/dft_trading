package com.dft.trading.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dft.trading.account.dao.LonLognDMO;
import com.dft.trading.account.io.LonLognIO;

@Service
public class LonLognBMC implements LonLognBMO {
	
	@Autowired
	private LonLognDMO userInfoDMO;	

	@Override
	public List<LonLognIO> getAllUserInfo() {
		System.out.println("************************** BMC >>> getAllUserInfo!!");
		return userInfoDMO.getAllUserInfo();
		
	}

	@Override
	public List<LonLognIO> getUserInfoByUserId(String userId) {
		System.out.println("************************** BMC >>> getUserInfoByUserId!!");
		return userInfoDMO.getUserInfoByUserId(userId);
	}
}
