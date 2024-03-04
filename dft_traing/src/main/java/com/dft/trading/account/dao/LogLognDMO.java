package com.dft.trading.account.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;

@Repository
public interface LogLognDMO {

	List<LogLognIO> getAllUserInfo();
	
	List<LogLognIO> getUserInfoByUserId(String userEmail, String userNm);
}
