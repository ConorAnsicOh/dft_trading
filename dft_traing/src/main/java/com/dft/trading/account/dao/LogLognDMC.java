package com.dft.trading.account.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;


@Repository
public class LogLognDMC extends SqlSessionDaoSupport  implements LogLognDMO {
	@Override
	public List<LogLognIO> SelectLogLognId(String userEmail, String userNm) {
		Map<String, String> params = new HashMap<>();
		params.put("userEmail", userEmail);
		params.put("userNm", userNm);
		return getSqlSession().selectList("com.dft.trading.account.dao.sql.LogLognSQL.SelectLogLognId", params);
	}

	@Override
	public List<LogLognIO> SelectLogLognPwd(String userId) {
		Map<String, String> params = new HashMap<>();
		params.put("userId", userId);
		return getSqlSession().selectList("com.dft.trading.account.dao.sql.LogLognSQL.SelectLogLognPwd", params);
	}
	
	@Override
	public List<LogLognIO> SelectLogLognNm(String userId, String userPwd) {
		List<LogLognIO> resultList = new ArrayList<>();
		Map<String, String> params = new HashMap<>();
		System.out.println("DMC:::::::::::::::::::" + userPwd);
		params.put("userId", userId);
		params.put("userPwd", userPwd);
		getSqlSession().selectOne("com.dft.trading.account.dao.sql.SgnSingSQL.readSalt", userId);
		resultList = getSqlSession().selectList("com.dft.trading.account.dao.sql.LogLognSQL.SelectLogLognNm", params);
		return resultList;
	}
	
}
