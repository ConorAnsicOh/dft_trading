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
		System.out.println("currentPassword:::::::::::::!!" + currentPassword);
		String encryptionPassword = sgnSignIo.setUserPw(sha256Util.sha256Encode(currentPassword, sha256Util.getSalt()));
		System.out.println("encryptionPassword:::::::::::::!!" + encryptionPassword);
		String salt = sha256Util.getSalt();
		System.out.println("salt:::::::::::::!!" + salt);
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("userId", sgnSignIo.getUserId());
		map.put("userPw", encryptionPassword);
		map.put("userEmail", sgnSignIo.getUserEmail());
		map.put("userNm", sgnSignIo.getUserNm());
		map.put("userNnm", sgnSignIo.getUserNnm());
		map.put("salt", salt);
		
		sgnSingDMO.createUser(map);
		
	}

	@Override
	public String SgngSingDuplicateCheck(String userId) {
		return sgnSingDMO.selectOneList(userId);
	}

	@Override
	public String readSalt(String userId) {
		return sgnSingDMO.readSalt(userId);
	}

	@Override
	public String emailDuplicateCheck(String userEmail) {
		return sgnSingDMO.selectOneEmail(userEmail);
	}

	@Override
	public void chagePassword(String userPwd,String userEmail) {
		SgnSingIO sgnSingIO = new SgnSingIO();
		String changePwd = sgnSingIO.setUserPw(sha256Util.sha256Encode(userPwd, sha256Util.getSalt()));
		HashMap<String, Object> map = new HashMap<>();
		map.put("userPw", changePwd);
		map.put("userEmail", userEmail);
		
		sgnSingDMO.updatePassword(map);
	}
	


}
