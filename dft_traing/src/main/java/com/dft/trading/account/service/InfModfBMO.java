package com.dft.trading.account.service;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public interface InfModfBMO {

	int UpdateInfModfNnm(Map<String, String> params, HttpServletRequest request) throws Exception;
	
	String saveFile(MultipartFile file, String userId, HttpServletRequest request);
}
