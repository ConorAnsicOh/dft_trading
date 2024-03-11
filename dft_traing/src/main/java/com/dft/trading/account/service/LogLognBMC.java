package com.dft.trading.account.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dft.trading.account.dao.LogLognDMO;
import com.dft.trading.account.dao.SgnSingDMO;
import com.dft.trading.account.io.LogLognIO;
import com.dft.trading.account.io.SgnSingIO;
import com.dft.trading.common.util.Sha256Util;


@Service
public class LogLognBMC implements LogLognBMO {
	
	@Autowired
	private LogLognDMO logLognDMO;	
	@Autowired
	private SgnSingDMO sgnSingDMO;
	private Sha256Util sha256Util;
	@Override
	public List<LogLognIO> SelectLogLognId(String userEmail, String userNm) {
		return logLognDMO.SelectLogLognId(userEmail, userNm);
	}
	
	@Override
	public List<LogLognIO> SelectLogLognPwd(String userId) {
		return logLognDMO.SelectLogLognPwd(userId);
	}
	
	@Override
	public List<LogLognIO> SelectLogLognNm(String userId, String userPwd,HttpServletRequest request) throws Exception {
		LogLognIO logLognIO = new LogLognIO();
		String salt = sgnSingDMO.readSalt(userId);
		System.out.println("salt::::" + salt);
		String userPassword = userPwd;
		System.out.println("userPassword::::" + userPassword);
		userPassword = sha256Util.sha256Encode(userPassword, salt);
		System.out.println("@userPassword@:::::" + userPassword);
		logLognIO.setUserPwd(userPassword);
		try {
			List<LogLognIO> returnList =logLognDMO.SelectLogLognNm(userId, userPassword);
				String userNm = "";
				if (!returnList.isEmpty()) {
		            userNm = returnList.get(0).getUserNm();
					HttpSession session = request.getSession();
					
					session.setAttribute("userNm", userNm);
		   
	        }else {
	        	HttpSession session = request.getSession();
		        
		        Integer loginCnt = (Integer) session.getAttribute("loginCnt");
		        
		        if (loginCnt == null) {
		        	loginCnt = 0;
		        }
		        
		        if (loginCnt >= 5) {
			        throw new Exception("비밀번호 5회 입력 실패입니다. 비밀번호 찾기를 이용해 주십시오.");
		        }
		        
		        loginCnt++;
		        
		        session.setAttribute("loginCnt", loginCnt);
		        
		        System.out.println("loginCnt ::: " + loginCnt);
				
				if(userNm.equals("")) {
					throw new Exception("아이디 혹은 패스워드가 일치하지 않습니다.");
				}
	        }

	        return returnList;
		} catch (Exception e) {
			throw e;
		}
	}
}
