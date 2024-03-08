package com.dft.trading.account.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;

@Repository
public interface LogLognDMO {
	
	List<LogLognIO> SelectLogLognId(String userEmail, String userNm);
	
	List<LogLognIO> SelectLogLognPwd(String userId);
	
	List<LogLognIO> SelectLogLognAll(String userId, String userPwd);
}
 