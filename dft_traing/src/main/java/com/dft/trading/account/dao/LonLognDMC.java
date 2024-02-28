package com.dft.trading.account.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LonLognIO;


@Repository
public class LonLognDMC extends SqlSessionDaoSupport implements LonLognDMO {
	
	@Override
	public List<LonLognIO> getAllUserInfo() {
		System.out.println("************************** DMC >>> getAllUserInfo!!");
		return getSqlSession().selectList("com.dft.trading.channel.dao.sql.UserInfoSQL.getAllUserInfo");
	}

	@Override
	public List<LonLognIO> getUserInfoByUserId(String userId) {
		System.out.println("************************** DMC >>> getUserInfoByUserId!!");
		return getSqlSession().selectList("com.dft.trading.channel.dao.sql.UserInfoSQL.getUserInfoByUserId", userId);
	}

}
