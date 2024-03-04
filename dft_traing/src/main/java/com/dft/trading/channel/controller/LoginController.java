package com.dft.trading.channel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.common.controller.LogLognCMO;


@Controller
public class LoginController {
	
	@Autowired
    private LogLognCMO logLognCMO;
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String logn() {
		return "/Log/LogLogn1100";
	}
	
	@RequestMapping(value = "/Login/Fdpw", method = RequestMethod.GET)
	public String fdpw() {
		return "/Log/LogLogn1101";
	}
	
	@RequestMapping(value = "/Login/Fdid", method = RequestMethod.GET)
	public String fdid() {
		return "/Log/LogLogn1102";
	}

	@RequestMapping(value = "/Login/FdidAjax", method = RequestMethod.POST)
	public ModelAndView ReadLogLogn(@RequestBody LogLognIO logLognIO) {
		String userEmail = logLognIO.getUserEmail();
        String userNm = logLognIO.getUserNm();
        
        System.out.println("userEmail ::: " + userEmail);
        System.out.println("userNm ::: " + userNm);
        
        List<LogLognIO> returnList = logLognCMO.getUserInfoByUserId(userEmail, userNm);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", returnList);
        modelAndView.setViewName("/Brd/BrdNews1100");

        return modelAndView;
	}
}
