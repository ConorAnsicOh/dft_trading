package com.dft.trading.account.service;

import java.util.List;

import com.dft.trading.account.io.BrdNewsIO;


public interface BrdNewsBMO {
	
    public List<BrdNewsIO> getAllObjects();
    
    void increaseCount(Long id);

} 