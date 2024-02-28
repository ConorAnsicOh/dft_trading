package com.dft.trading.channel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.common.controller.LogLognCMO;

@Controller
public class BoardController {
	
	 @Autowired
    private LogLognCMO lonLognCMO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {

		return "/Brd/BrdNews1100";
	}
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String subMain() {
		
		return "/Log/LogLogn1100";
	}

	@RequestMapping(value = "/LogLogn1100/{userId}&{userPwd}", method = RequestMethod.GET)
	public ModelAndView ReadLonLogn(@PathVariable String userId, String userPwd) {
        List<LogLognIO> returnList = lonLognCMO.getUserInfoByUserId(userId, userPwd);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", returnList);
        modelAndView.setViewName("/Brd/BrdNews1100");

        return modelAndView;
	}
	
	

//	@RequestMapping(value = "/userInfo/{userId}", method = RequestMethod.GET)
//	public List<UserInfoVO> getUserInfoByUserId(@PathVariable String userId) {
//		System.out.println("************************** CONTROELLER >>> getUserInfoByUserId!!");
//		System.out.println("************************** CONTROELLER >>> getUserInfoByUserId!!");
//		System.out.println("************************** CONTROELLER >>> getUserInfoByUserId!!");
//		
//		System.out.println(userInfoBMO.getUserInfoByUserId(userId));
//		return userInfoBMO.getUserInfoByUserId(userId);
//
//	}
//
//	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
//	public List<UserInfoVO> getAllUserInfo() {
//		System.out.println("************************** CONTROELLER >>> getAllUserInfo!!");
//
//		System.out.println(userInfoBMO.getAllUserInfo());
//		return userInfoBMO.getAllUserInfo();
//
//	}
}
