package com.dft.trading.channel.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dft.trading.account.io.SgnSingIO;
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
	@RequestMapping(value = "/duplicateCheck", method = RequestMethod.POST)
	public HashMap<String,String> SgngSingDuplicateCheck(@RequestParam("userId") String userId) {
		sgnSingCMO.SgngSingDuplicateCheck(userId);
		HashMap<String, String> map = new HashMap<>();
		map.put("userId", userId);
		
		return map;
	}
}
