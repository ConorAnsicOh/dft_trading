package com.dft.trading.channel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dft.trading.account.io.LonLognIO;
import com.dft.trading.common.controller.LonLognCMO;

@Controller
public class ChannelController {
	
	 @Autowired
    private LonLognCMO lonLognCMO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {

		return "/Brd/BrdNews1100";
	}

	@RequestMapping(value = "/LonLogn1100/{userId}&{userPwd}", method = RequestMethod.GET)
	public ModelAndView endpoint1() {
        List<LonLognIO> returnList = lonLognCMO.getUserInfoByUserId("userId", "userPwd");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", returnList);

        // View 이름 설정
        modelAndView.setViewName("viewName");

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
