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
public class LoginController {
	
	@Autowired
    private LogLognCMO lonLognCMO;
	
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
}
