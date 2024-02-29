package com.dft.trading.account.dao;


import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.SgnSingIO;

@Repository
public class SgnSingDMC extends SqlSessionDaoSupport  implements SgnSingDMO {
	
	@Override
	public void createUser(SgnSingIO sgnSignIo) {
		getSqlSession().insert("com.dft.trading.account.dao.sql.SgnSingSQL.createUser", sgnSignIo);
	}

}
