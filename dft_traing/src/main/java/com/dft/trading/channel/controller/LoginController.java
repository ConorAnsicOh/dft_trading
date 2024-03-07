package com.dft.trading.channel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.common.controller.LogLognCMO;



@Controller
public class LoginController {
	
	@Autowired
    private LogLognCMO logLognCMO;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request)throws Exception {
		HttpSession session = request.getSession();
		
		session.setAttribute("userNm", "");
		session.setAttribute("loginCnt", 0);

		String userNm = (String) session.getAttribute("userNm");
		Integer loginCnt = (Integer) session.getAttribute("loginCnt");
		
		System.out.println("userNm 초기화 됨? : " + userNm);
		System.out.println("loginCnt 초기화 됨? : " + loginCnt);
		
		return "/Log/LogLogn1100";
	}
	
	@ResponseBody
	@RequestMapping(value = "/loginAjax", method = RequestMethod.POST, produces = "application/json")
	public List<LogLognIO> loginAjax(LogLognIO logLognIO, HttpServletRequest request) throws Exception {
	    String userId = logLognIO.getUserId();
	    String userPwd = logLognIO.getUserPwd();
	    
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognNm(userId, userPwd, request);
	    
	    return returnList;
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    
	    session.removeAttribute("userNm");
	    session.removeAttribute("loginCnt");
	    
		String userNm = (String) session.getAttribute("userNm");
		Integer loginCnt = (Integer) session.getAttribute("loginCnt");
		
	    session.invalidate();
		
        logger.info("이선기 조회수 증가 컨트롤러!!!!!!!!::::::::::::" + userNm);
        logger.info("이선기 조회수 증가 컨트롤러!!!!!!!!::::::::::::" + loginCnt);

	    return "redirect:/"; // 로그아웃 성공 후 리다이렉트할 URL
	}
	
	@RequestMapping(value = "/moveFindId", method = RequestMethod.GET)
	public String moveFindId() {
		return "/Log/LogLogn1102";
	}

	@ResponseBody
	@RequestMapping(value = "/findIdAjax", method = RequestMethod.POST, produces = "application/json")
	public List<LogLognIO> findIdAjax(LogLognIO logLognIO) {
	    // Controller logic here...
	    String userEmail = logLognIO.getUserEmail();
	    String userNm = logLognIO.getUserNm();
	    
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognId(userEmail, userNm);

	    return returnList;
	}
	
	@RequestMapping(value = "/moveFindPwd", method = RequestMethod.GET)
	public String moveFindPwd() {
		return "/Log/LogLogn1101";
	}
	
	@ResponseBody
	@RequestMapping(value = "/findPwdAjax", method = RequestMethod.POST, produces = "application/json")
	public List<LogLognIO> findPwdAjax(LogLognIO logLognIO) {
	    String userId = logLognIO.getUserId();
	    
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognPwd(userId);
	    
	    System.out.println("결과값 ::: " + returnList);

	    return returnList;
	}
}
