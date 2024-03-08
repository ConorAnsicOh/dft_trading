package com.dft.trading.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dft.trading.account.dao.BrdNewsDMO;
import com.dft.trading.account.io.BrdNewsIO;


@Service
public class BrdNewsBMC implements BrdNewsBMO {
	 
	@Autowired
    private BrdNewsDMO brdNewsDMO;

    @Override
    public List<BrdNewsIO> getAllObjects() {
    	System.out.println("이선기 BrdNewsBMC 탑승!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return brdNewsDMO.getAllObjects();
    }
    

    @Override
    @Transactional
    public void increaseCount(Long id) {
    	System.out.println("이선기 조회수 증가 BMC!!!!!!!!::::::::::::");
    	brdNewsDMO.increaseCount(id);
    }
}
 
