package com.dft.trading.account.dao;


import org.springframework.stereotype.Repository;

import com.dft.trading.account.io.SgnSingIO;

@Repository
public interface SgnSingDMO {

	void createUser(SgnSingIO sgnSignIo);

}
