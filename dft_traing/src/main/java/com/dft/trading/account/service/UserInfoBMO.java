package com.dft.trading.account.service;

import java.util.List;

import com.dft.trading.channel.io.UserInfoIO;

public interface UserInfoBMO {

	List<UserInfoIO> getAllUserInfo();

	List<UserInfoIO> getUserInfoByUserId(String userId);
	
}
