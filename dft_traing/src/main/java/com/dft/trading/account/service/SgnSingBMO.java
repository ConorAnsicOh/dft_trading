package com.dft.trading.account.service;



import com.dft.trading.account.io.SgnSingIO;

public interface SgnSingBMO {

	void singUp(SgnSingIO sgnSignIo);

	String SgngSingDuplicateCheck(String userId);

	String readSalt(String userId);

	String emailDuplicateCheck(String userEmail);

	void chagePassword(String userPwd,String userEmail);



}
