package com.dft.trading.channel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dft.trading.account.io.SgnSingIO;
import com.dft.trading.common.controller.SgnSingCMO;

@Controller
public class SingupController {
	@Autowired
	private SgnSingCMO sgnSingCMO;
	
	//회원가입view
	@RequestMapping(value = "/SingUp", method = RequestMethod.GET)
	public String SingUp() {
		return "/Sgn/SgnSign1100";
	}
	//비밀번호변경view(아이디입력페이지 -> 새 비밀번호 페이지 -> 완료페이지나,알럯)
	@RequestMapping(value = "/passwordChange", method = RequestMethod.GET)
	public String passwordChange() {
		return "/Sgn/SgnSign1101";
	}
	//회원가입 처리
	@ResponseBody
	@RequestMapping(value = "/SgnSingUp", method = RequestMethod.POST)
	public String SgngSing(SgnSingIO sgnSingIO, String userId) {
		sgnSingCMO.singUp(sgnSingIO);
		
		return "/Log/LogLogn1100";
	}
	//중복체크
	@ResponseBody
	@RequestMapping(value = "/duplicateCheck", method = RequestMethod.POST)
	public String SgngSingDuplicateCheck(String userId) {
		String result ="";  
		result= sgnSingCMO.SgngSingDuplicateCheck(userId);
		
		return result;
	}
	//이메일 중복체크
	@ResponseBody
	@RequestMapping(value = "/emailCheck", method = RequestMethod.POST)
	public String emailDuplicateCheck(String userEmail) {
		String result ="";  
		result= sgnSingCMO.emailDuplicateCheck(userEmail);
		System.out.println("result :::" + result);
		return result;
	}
	@ResponseBody
	@RequestMapping(value = "/pwdChange", method = RequestMethod.POST)
	public String changePassword(String userPwd, String userEmail) {
		sgnSingCMO.chagePassword(userPwd,userEmail);
		return "/Log/LogLogn1100";
	}
}
