package com.dft.trading.channel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.common.controller.LogLognCMO;



@Controller
public class LoginController {
	
	@Autowired
    private LogLognCMO logLognCMO;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/login")
	public String login(HttpServletRequest request)throws Exception {
		HttpSession session = request.getSession();
		
		session.setAttribute("userNm", "");
		session.setAttribute("loginCnt", 0);
		
		return "Log/LogLogn1100";
	}
	
	@ResponseBody
	@PostMapping("/loginAjax")
	public List<LogLognIO> loginAjax(LogLognIO logLognIO, HttpServletRequest request) throws Exception {
	    String userId = logLognIO.getUserId();
	    String userPwd = logLognIO.getUserPwd();
	    
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognAll(userId, userPwd, request);
	    
	    return returnList;
	}
	
	@GetMapping("/logout")
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
	
	@GetMapping("/moveFindId")
	public String moveFindId() {
		return "Log/LogLogn1102";
	}

	@ResponseBody
	@PostMapping("/findIdAjax")
	public List<LogLognIO> findIdAjax(LogLognIO logLognIO) {
	    String userEmail = logLognIO.getUserEmail();
	    String userNm = logLognIO.getUserNm();
	    
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognId(userEmail, userNm);

	    return returnList;
	}
	
	@GetMapping("/moveFindPwd")
	public String moveFindPwd() {
		return "Log/LogLogn1101";
	}
	
	@ResponseBody
	@PostMapping("/findPwdAjax")
	public List<LogLognIO> findPwdAjax(LogLognIO logLognIO) {
	    String userId = logLognIO.getUserId();
	    
	    List<LogLognIO> returnList = logLognCMO.SelectLogLognPwd(userId);

	    return returnList;
	}
}
