package com.dft.trading.channel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/channel")
public class ChannelController2 {
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String subMain() {
		
		return "/channel/test1";
	}
}
