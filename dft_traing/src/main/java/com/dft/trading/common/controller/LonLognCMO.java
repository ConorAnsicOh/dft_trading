package com.dft.trading.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dft.trading.account.io.LonLognIO;
import com.dft.trading.account.service.LonLognBMO;

public class LonLognCMO {

	@Autowired
	private LonLognBMO lonLognBMO;
	
	public List<LonLognIO> getUserInfoByUserId(String userId, String userPwd) {
		
		return lonLognBMO.getUserInfoByUserId(userId, userPwd);
	}
}
