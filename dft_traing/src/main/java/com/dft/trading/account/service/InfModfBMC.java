package com.dft.trading.account.service;

import java.io.File;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.dft.trading.account.dao.InfModfDMO;
import com.dft.trading.account.io.InfModfIO;
import com.dft.trading.account.service.LogLognBMC.FileReaderExample;


@Service
public class InfModfBMC implements InfModfBMO {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private InfModfDMO infModfDMO;	
	
	@Override
	public int UpdateInfModfNnm(Map<String, String> params, HttpServletRequest request) throws Exception {
		try {
			int result = infModfDMO.UpdateInfModfNnm(params);
			
			HttpSession session = request.getSession();
			
			String userNnm = params.get("userNnm");
			
			session.setAttribute("userNnm", userNnm);
			
			return result;
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public String saveFile(MultipartFile file, String userId, HttpServletRequest request) {
	    if (file != null) {
	        String sysFileName = userId + ".jpg";
	        File saveDir = new File("C:\\images"); // 디렉토리 경로
	        if (!saveDir.exists()) { // 디렉토리가 존재하지 않으면
	            saveDir.mkdirs(); // 디렉토리 생성
	        }
	        File saveFile = new File(saveDir, sysFileName); // 전체 경로 지정
	        try {
	        	if (saveFile.exists()) {
	                saveFile.delete(); // 이미 파일이 존재하면 삭제
	            }
	            file.transferTo(saveFile); // 해당 위치에 파일 저장
	            
				HttpSession session = request.getSession();
	            
	            String filePath = "C://images/" + userId + ".jpg";
	            byte[] fileContent = FileReaderExample.readFileContent(filePath);
	            
	            session.setAttribute("userImg", fileContent);
	            
	            return sysFileName;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "error";
	        }
	    } else {
	        return "error";
	    }
	}
}
