package com.dft.trading.account.dao;


import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;

@Repository
public class SgnSingDMC extends SqlSessionDaoSupport  implements SgnSingDMO {
	
	@Override
	public void createUser(HashMap<String, Object> map) {
	 getSqlSession().insert("com.dft.trading.account.dao.sql.SgnSingSQL.createUser", map);
		
	}

	@Override
	public List<LogLognIO> selectOneList(String userId) {
		return getSqlSession().selectList("com.dft.trading.account.dao.sql.LogLognSQL.findByUserId", userId);
		
	}

}
