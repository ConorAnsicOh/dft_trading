package com.dft.trading.account.dao;

import java.util.List;

import com.dft.trading.channel.io.UserInfoIO;

public interface UserInfoDMO {

	List<UserInfoIO> getAllUserInfo();
	
	List<UserInfoIO> getUserInfoByUserId(String userId);
}
