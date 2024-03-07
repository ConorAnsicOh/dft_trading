package com.dft.trading.channel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.io.SgnSingIO;
import com.dft.trading.common.controller.LogLognCMO;
import com.dft.trading.common.controller.SgnSingCMO;



@Controller
public class LoginController {
	
	@Autowired
    private LogLognCMO logLognCMO;
	@Autowired
	private SgnSingCMO sgnSingCMO;
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String logn(HttpServletRequest request)throws Exception {
		HttpSession session = request.getSession();
		 
		session.setAttribute("userNm", "");
		session.setAttribute("loginCnt", 0);

		String userNm = (String) session.getAttribute("userNm");
		Integer loginCnt = (Integer) session.getAttribute("loginCnt");
		
		System.out.println("userNm 초기화 됨? : " + userNm);
		System.out.println("loginCnt 초기화 됨? : " + loginCnt);
		
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

	@ResponseBody
	@RequestMapping(value = "/Login/FdidAjax", method = RequestMethod.POST, produces = "application/json")
	public List<LogLognIO> ReadLogLognId(LogLognIO logLognIO) {
	    // Controller logic here...
	    String userEmail = logLognIO.getUserEmail();
	    String userNm = logLognIO.getUserNm();
	    
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognId(userEmail, userNm);

	    return returnList;
	}
	
	@ResponseBody
	@RequestMapping(value = "/Login/FdpwdAjax", method = RequestMethod.POST, produces = "application/json")
	public List<LogLognIO> ReadLogLognPwd(LogLognIO logLognIO) {
	    String userId = logLognIO.getUserId();
	    
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognPwd(userId);
	    
	    System.out.println("결과값 ::: " + returnList);

	    return returnList;
	}
	
	@ResponseBody
	@RequestMapping(value = "/Login/LoginAjax", method = RequestMethod.POST, produces = "application/json")
	public List<LogLognIO> ReadLogLognLogin(LogLognIO logLognIO,SgnSingIO sgnSingIO, HttpServletRequest request) throws Exception {
	    String userId = logLognIO.getUserId();
	    String userPwd = logLognIO.getUserPwd();
	    sgnSingCMO.readSalt(userId);
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognNm(userId, userPwd, request);
	    return returnList;
	    
	}
	
	@RequestMapping(value = "/Login/moveAjax", method = RequestMethod.GET)
	public String ReadLogLognMove() {

        return "/Brd/BrdNews1100";
	}
}
