package com.dft.trading.account.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.BrdNewsIO;


@Repository
public interface BrdNewsDMO {
	
    public List<BrdNewsIO> getAllObjects();

    void increaseCount(Long id);
}
