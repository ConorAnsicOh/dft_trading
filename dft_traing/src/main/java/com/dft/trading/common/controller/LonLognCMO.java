package com.dft.trading.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dft.trading.account.io.LonLognIO;
import com.dft.trading.account.service.LonLognBMO;

public class LonLognCMO {

	@Autowired
	private LonLognBMO userInfoBMO;
	
	@RequestMapping(value = "/userInfo/{userId}", method = RequestMethod.GET)
	public List<LonLognIO> getUserInfoByUserId(@PathVariable String userId) {
		System.out.println("************************** CONTROELLER >>> getUserInfoByUserId!!");
		System.out.println("************************** CONTROELLER >>> getUserInfoByUserId!!");
		System.out.println("************************** CONTROELLER >>> getUserInfoByUserId!!");
		
		System.out.println(userInfoBMO.getUserInfoByUserId(userId));
		return userInfoBMO.getUserInfoByUserId(userId);

	}
}
