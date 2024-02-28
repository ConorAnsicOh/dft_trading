package com.dft.trading.channel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SingupController {
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String subMain() {
		
		return "/channel/test1";
	}
	@RequestMapping(value = "/SingUp", method = RequestMethod.GET)
	public String SingUp() {
		return "/Sgn/SgnSign1100";
	}
}
