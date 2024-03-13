package com.dft.trading.account.dao;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public class InfModfDMC extends SqlSessionDaoSupport implements InfModfDMO {
	private Logger logger = LoggerFactory.getLogger(getClass());
 
	@Override
	public int UpdateInfModfNnm(Map<String, String> params) {
		return getSqlSession().update("com.dft.trading.account.dao.sql.InfModfSQL.UpdateInfModfNnm", params);
	}
}