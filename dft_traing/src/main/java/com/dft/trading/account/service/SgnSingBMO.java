package com.dft.trading.account.service;



import com.dft.trading.account.io.SgnSingIO;

public interface SgnSingBMO {

	void singUp(SgnSingIO sgnSignIo);

	void SgngSingDuplicateCheck(String userId);

}
