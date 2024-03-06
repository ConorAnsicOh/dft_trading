package com.dft.trading.channel.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	@RequestMapping(value = "/Brd/main", method = RequestMethod.GET)
	public String brdMain() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
		return "Brd/BrdNews1100";
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
