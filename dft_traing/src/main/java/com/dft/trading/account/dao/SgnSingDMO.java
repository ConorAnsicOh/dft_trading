package com.dft.trading.account.dao;


import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.io.SgnSingIO;

@Repository
public interface SgnSingDMO {

	void createUser(HashMap<String, Object> map);

	void selectOneList(String userId);

}
