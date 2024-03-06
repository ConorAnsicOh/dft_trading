package com.dft.trading.common.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dft.trading.account.io.SgnSingIO;
import com.dft.trading.account.service.SgnSingBMO;

@Component
public class SgnSingCMO {
	@Autowired
	private SgnSingBMO sgnSingBMO;
	
	public void singUp(SgnSingIO sgnSignIo){
		 sgnSingBMO.singUp(sgnSignIo);
		
	}
	public String SgngSingDuplicateCheck(String userId) {
		
		return sgnSingBMO.SgngSingDuplicateCheck(userId);
	}
}
