package com.dft.trading.channel.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.channel.vo.UserInfoVO;

@Repository
public class UserInfoDMC extends SqlSessionDaoSupport implements UserInfoDMO {
	
	@Override
	public List<UserInfoVO> getAllUserInfo() {
		System.out.println("************************** DMC >>> getAllUserInfo!!");
		return getSqlSession().selectList("com.dft.trading.channel.dao.sql.UserInfoSQL.getAllUserInfo");
	}

	@Override
	public List<UserInfoVO> getUserInfoByUserId(String userId) {
		System.out.println("************************** DMC >>> getUserInfoByUserId!!");
		return getSqlSession().selectList("com.dft.trading.channel.dao.sql.UserInfoSQL.getUserInfoByUserId", userId);
	}

}
