package com.dft.trading.channel.service;

import java.util.List;

import com.dft.trading.channel.vo.UserInfoVO;

public interface UserInfoBMO {

	List<UserInfoVO> getAllUserInfo();

	List<UserInfoVO> getUserInfoByUserId(String userId);
	
}
