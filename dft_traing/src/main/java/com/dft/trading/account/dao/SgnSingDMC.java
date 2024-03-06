package com.dft.trading.account.dao;


import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.io.SgnSingIO;

@Repository
public class SgnSingDMC extends SqlSessionDaoSupport  implements SgnSingDMO {
	
	@Override
	public void createUser(HashMap<String, Object> map) {
	 getSqlSession().insert("com.dft.trading.account.dao.sql.SgnSingSQL.createUser", map);
		
	}

	@Override
	public String selectOneList(String userId) {
		return getSqlSession().selectOne("com.dft.trading.account.dao.sql.SgnSingSQL.findByUserId", userId);
	}

}
