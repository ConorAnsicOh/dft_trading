package com.dft.trading.channel.controller;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.dft.trading.account.io.InfModfIO;
import com.dft.trading.common.controller.InfModfCMO;



@Controller
public class ModifyController {
	@Autowired
    private InfModfCMO infModfCMO;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@ResponseBody
	@PostMapping("/upLoad")
	public String registerFileForm(HttpServletRequest request) throws ServletException, IOException {
	    Collection<Part> parts = request.getParts();

	    String fileDir = "/C:/eclipse/workspace/dft_traing_testbed/WebContent/resources/images";
	    for (Part part : parts) {
	        part.write(fileDir + part.getSubmittedFileName());
	    }
	    return "이미지 등록에 성공했습니다.";
	}
	
	@GetMapping("/modify")
	public String modify() {
		return "Inf/InfModf1100";
	}
	
	@ResponseBody
	@PostMapping("/modifyNnmAjax")
	public String modfNnmAjax(InfModfIO infModfIO, HttpServletRequest request) throws Exception {
		String userNnm = infModfIO.getUserNnm();
		String userId = infModfIO.getUserId();
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("userNnm", userNnm);
		params.put("userId", userId);
		
		infModfCMO.UpdateInfModfNnm(params, request);
		
		return "변경이 완료되었습니다.";
	}
	
	@ResponseBody
	@PostMapping("/modifyImgAjax")
	public String saveFile(InfModfIO infModfIO, @SessionAttribute("userId") String userId, HttpServletRequest request) {
	    MultipartFile file = infModfIO.getFile();
	    
	    infModfCMO.saveFile(file, userId, request);
	    
	    return "변경이 완료되었습니다.";
	}
}
