package com.dft.trading.common.controller;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.dft.trading.account.service.InfModfBMO;

@Component
public class InfModfCMO {
	@Autowired
	private InfModfBMO infModfBMO;
	
	public int UpdateInfModfNnm(Map<String, String> params, HttpServletRequest request) throws Exception{
		return infModfBMO.UpdateInfModfNnm(params, request);
	}
	
	public String saveFile(MultipartFile file, String userId, HttpServletRequest request) {
		return infModfBMO.saveFile(file, userId, request);
	}
}
 