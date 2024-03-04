package com.dft.trading.channel.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.io.SgnSingIO;
import com.dft.trading.common.controller.LogLognCMO;
import com.dft.trading.common.controller.SgnSingCMO;


@Controller
public class SingupController {
	@Autowired
	private SgnSingCMO sgnSingCMO;
	
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String subMain() {
		
		return "/channel/test1";
	}
	@RequestMapping(value = "/SingUp", method = RequestMethod.GET)
	public String SingUp() {
		return "/Sgn/SgnSign1100";
	}
	//회원가입 처리
	@RequestMapping(value = "/SgnSingUp", method = RequestMethod.POST)
	public String SgngSing(SgnSingIO sgnSingIO) {
		sgnSingCMO.singUp(sgnSingIO);
		return "/Log/LogLogn1100";
	}
	//중복체크
	@RequestMapping(value = "/duplicateCheck", method = RequestMethod.GET)
	public ModelAndView SgngSingDuplicateCheck(SgnSingIO sgnSingIO) {
		String userId = sgnSingIO.getUserId();
		List<LogLognIO> returnList = sgnSingCMO.SgngSingDuplicateCheck(userId);
		
		System.out.println("userId"  + userId);
		System.out.println("returnList"  + returnList);
		return new ModelAndView("/Sgn/SgnSign1100");
	}
}
