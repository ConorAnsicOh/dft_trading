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
	private SgnSingDMO sgnSignDMO;
	private Sha256Util sha256Util;
	
	@Override
	public void singUp(SgnSingIO sgnSignIo) {
		String currentPassword = sgnSignIo.getUserPw();
		String encryptionPassword = currentPassword;
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("userId", sgnSignIo.getUserId());
		map.put("userPw",sgnSignIo.setUserPw(sha256Util.sha256Encode(encryptionPassword, sha256Util.getSalt())));
		map.put("userEmail", sgnSignIo.getUserEmail());
		map.put("userNm", sgnSignIo.getUserNm());
		map.put("userNnm", sgnSignIo.getUserNnm());
		sgnSignDMO.createUser(map);
	}

	@Override
	public String SgngSingDuplicateCheck(String userId) {
		return sgnSignDMO.selectOneList(userId);
	}
	


}
