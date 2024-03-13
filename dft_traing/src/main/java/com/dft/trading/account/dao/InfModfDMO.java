package com.dft.trading.account.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface InfModfDMO {
	
	int UpdateInfModfNnm(Map<String, String> params);
}
 