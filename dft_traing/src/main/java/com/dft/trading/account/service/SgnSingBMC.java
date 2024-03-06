package com.dft.trading.account.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dft.trading.account.dao.SgnSingDMO;
import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.io.SgnSingIO;
import com.dft.trading.common.util.Sha256Util;

@Service
public class SgnSingBMC implements SgnSingBMO {
	@Autowired
	private SgnSingDMO sgnSingDMO;
	private Sha256Util sha256Util;
	
	@Override
	public void singUp(SgnSingIO sgnSignIo) {
		String currentPassword = sgnSignIo.getUserPw();
		String encryptionPassword = sgnSignIo.setUserPw(sha256Util.sha256Encode(currentPassword, sha256Util.getSalt()));
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("userId", sgnSignIo.getUserId());
		map.put("userPw", encryptionPassword);
		map.put("userEmail", sgnSignIo.getUserEmail());
		map.put("userNm", sgnSignIo.getUserNm());
		map.put("userNnm", sgnSignIo.getUserNnm());
		
		sgnSingDMO.createUser(map);
		
	}

	@Override
	public String SgngSingDuplicateCheck(String userId) {
		return sgnSingDMO.selectOneList(userId);
	}
	


}
