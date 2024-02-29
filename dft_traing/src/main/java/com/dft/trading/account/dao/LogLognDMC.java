package com.dft.trading.account.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;


@Repository
public class LogLognDMC extends SqlSessionDaoSupport implements LogLognDMO {
	
	@Override
	public List<LogLognIO> getAllUserInfo() {
		System.out.println("************************** DMC >>> getAllUserInfo!!");
		return getSqlSession().selectList("com.dft.trading.account.dao.sql.UserInfoSQL.getAllUserInfo");
	}

	@Override
	public List<LogLognIO> getUserInfoByUserId(String userId, String userPwd) {
		System.out.println("************************** DMC >>> getUserInfoByUserId!!");
		return getSqlSession().selectList("com.dft.trading.account.dao.sql.UserInfoSQL.getUserInfoByUserId", userId);
	}

}
