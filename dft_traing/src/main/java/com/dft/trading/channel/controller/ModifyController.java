package com.dft.trading.channel.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class ModifyController {
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
		logger.info("1111111111111");
		return "Inf/InfModf1100";
	}
}
