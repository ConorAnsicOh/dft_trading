package com.dft.trading.account.service;


import java.util.List;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.io.SgnSingIO;

public interface SgnSingBMO {

	void singUp(SgnSingIO sgnSignIo);

	String SgngSingDuplicateCheck(String userId);

}
