package com.dft.trading.account.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<LogLognIO> getUserInfoByUserId(String userEmail, String userNm) {
		Map<String, String> params = new HashMap<>();
		params.put("userEmail", userEmail);
		params.put("userNm", userNm);
		System.out.println("************************** DMC >>> getUserInfoByUserId!!");
		return getSqlSession().selectList("com.dft.trading.account.dao.sql.UserInfoSQL.getUserInfoByUserId", params);
	}

}
