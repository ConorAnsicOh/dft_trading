package com.dft.trading.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dft.trading.account.dao.UserInfoDMO;
import com.dft.trading.channel.io.UserInfoIO;

@Service
public class UserInfoBMC implements UserInfoBMO {
	
	@Autowired
	private UserInfoDMO userInfoDMO;	

	@Override
	public List<UserInfoIO> getAllUserInfo() {
		System.out.println("************************** BMC >>> getAllUserInfo!!");
		return userInfoDMO.getAllUserInfo();
		
	}

	@Override
	public List<UserInfoIO> getUserInfoByUserId(String userId) {
		System.out.println("************************** BMC >>> getUserInfoByUserId!!");
		return userInfoDMO.getUserInfoByUserId(userId);
	}
}
