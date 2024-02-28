package com.dft.trading.channel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dft.trading.account.service.UserInfoBMO;
import com.dft.trading.channel.io.UserInfoIO;

@Controller
public class ChannelController {

	@Autowired
	private UserInfoBMO userInfoBMO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {

		return "/Brd/BrdNews1100";
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
