package com.dft.trading.account.dao;

import java.util.List;

import com.dft.trading.channel.vo.UserInfoVO;

public interface UserInfoDMO {

	List<UserInfoVO> getAllUserInfo();
	
	List<UserInfoVO> getUserInfoByUserId(String userId);
}
