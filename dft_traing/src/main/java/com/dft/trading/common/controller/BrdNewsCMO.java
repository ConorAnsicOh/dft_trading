package com.dft.trading.common.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dft.trading.account.io.BrdNewsIO;
import com.dft.trading.account.service.BrdNewsBMO;



@Component
public class BrdNewsCMO {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private BrdNewsBMO brdNewsBMO;
	
    public List<BrdNewsIO> getAllObjects() {
        logger.info("이선기 select CMO 탑승!!!!!!!!::::::::::::");
        return brdNewsBMO.getAllObjects();
    }
    public void increaseCount(Long id) {
        logger.info("이선기 조회수 증가 CMO!!!!!!!!::::::::::::" + id);
    	brdNewsBMO.increaseCount(id);
    }
}
