package com.dft.trading.channel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dft.trading.channel.dao.UserInfoDMO;
import com.dft.trading.channel.vo.UserInfoVO;

@Service
public class UserInfoBMC implements UserInfoBMO {
	
	@Autowired
	private UserInfoDMO userInfoDMO;	

	@Override
	public List<UserInfoVO> getAllUserInfo() {
		System.out.println("************************** BMC >>> getAllUserInfo!!");
		return userInfoDMO.getAllUserInfo();
		
	}

	@Override
	public List<UserInfoVO> getUserInfoByUserId(String userId) {
		System.out.println("************************** BMC >>> getUserInfoByUserId!!");
		return userInfoDMO.getUserInfoByUserId(userId);
	}
}
