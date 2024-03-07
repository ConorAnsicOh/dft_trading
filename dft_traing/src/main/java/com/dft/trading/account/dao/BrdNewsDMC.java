package com.dft.trading.account.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.BrdNewsIO;

@Repository
public class BrdNewsDMC extends SqlSessionDaoSupport implements BrdNewsDMO {

    @Override
    public List<BrdNewsIO> getAllObjects() {
    	
    	System.out.println("이선기 BrdNewsDMCTRYTRYTRYTRYTRYTRYTRY 탑승!!!!!!!!!!!!!!!! !!!!!!!!!!!");
    	return getSqlSession().selectList("com.dft.trading.account.dao.sql.BrdNewsSQL.getAllObjects");
    }
    
    @Override
    public void increaseCount(Long id) {
    	System.out.println("이선기 조회수 증가 DMC!!!!!!!!::::::::::::");
        getSqlSession().update("com.dft.trading.account.dao.sql.BrdNewsSQL.increaseCount", id);
        logger.info("increaseCount 메서드 실행 완료.");
    }
}


