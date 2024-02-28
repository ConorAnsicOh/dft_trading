package com.dft.trading.account.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.channel.io.UserInfoIO;

@Repository
public class UserInfoDMC extends SqlSessionDaoSupport implements UserInfoDMO {
	
	@Override
	public List<UserInfoIO> getAllUserInfo() {
		System.out.println("************************** DMC >>> getAllUserInfo!!");
		return getSqlSession().selectList("com.dft.trading.channel.dao.sql.UserInfoSQL.getAllUserInfo");
	}

	@Override
	public List<UserInfoIO> getUserInfoByUserId(String userId) {
		System.out.println("************************** DMC >>> getUserInfoByUserId!!");
		return getSqlSession().selectList("com.dft.trading.channel.dao.sql.UserInfoSQL.getUserInfoByUserId", userId);
	}

}
