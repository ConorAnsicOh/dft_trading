package com.dft.trading.channel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/account")
public class ChannelController3 {
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String subMain() {
		
		return "/account/test2";
	}
}
