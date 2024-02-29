package com.dft.trading.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dft.trading.account.dao.SgnSingDMO;
import com.dft.trading.account.io.SgnSingIO;

@Service
public class SgnSingBMC implements SgnSingBMO {
	@Autowired
	private SgnSingDMO sgnSignDMO;

	@Override
	public void singUp(SgnSingIO sgnSignIo) {
		sgnSignDMO.createUser(sgnSignIo);
	}
	


}
