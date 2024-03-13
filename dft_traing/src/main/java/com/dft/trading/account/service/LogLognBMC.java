package com.dft.trading.account.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dft.trading.account.dao.LogLognDMO;
import com.dft.trading.account.io.LogLognIO;


@Service
public class LogLognBMC implements LogLognBMO {
	
	@Autowired
	private LogLognDMO logLognDMO;	

	@Override
	public List<LogLognIO> SelectLogLognId(String userEmail, String userNm) {
		return logLognDMO.SelectLogLognId(userEmail, userNm);
	}
	
	@Override
	public List<LogLognIO> SelectLogLognPwd(String userId) {
		return logLognDMO.SelectLogLognPwd(userId);
	}
	
	public class FileReaderExample {
	    public static byte[] readFileContent(String filePath) throws IOException {
	        File file = new File(filePath);
	        return Files.readAllBytes(file.toPath());
	    }
	}
	 
	@Override
	public List<LogLognIO> SelectLogLognAll(String userId, String userPwd, HttpServletRequest request) throws Exception {
		try {
			List<LogLognIO> returnList = logLognDMO.SelectLogLognAll(userId, userPwd);
			
			String userNm = "";
			String userNnm = "";
			if (!returnList.isEmpty()) {
	            userNm = returnList.get(0).getUserNm();
	            userNnm = returnList.get(0).getUserNnm();
				HttpSession session = request.getSession();
				
				session.setAttribute("userNm", userNm);
				session.setAttribute("userNnm", userNnm);
				session.setAttribute("userId", userId);
				
				String filePath = "C://images/" + userId + ".jpg";
	            byte[] fileContent = FileReaderExample.readFileContent(filePath);
	            
	            session.setAttribute("userImg", fileContent);
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
