package com.dft.trading.channel.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dft.trading.account.io.BrdNewsIO;
import com.dft.trading.common.controller.BrdNewsCMO;

@Controller
public class BoardController {
	
	@Autowired
	private BrdNewsCMO brdNewsCMO;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
    
//    @Autowired
//    public BoardController(BrdNewsCMO brdNewsCMO) {
//        this.brdNewsCMO = brdNewsCMO;
//    }
    

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model) {
        List<BrdNewsIO> myObjects = brdNewsCMO.getAllObjects();
        logger.info("이선기 @Controller 탑승!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        model.addAttribute("NewsD", myObjects);
        return "/Brd/BrdNews1100";
    }
    
	
//	@RequestMapping("/news")
    @PostMapping("/news/increaseCount")
    @ResponseBody
    public String increaseCount(@RequestParam Long newsId) {
        logger.info("이선기 조회수 증가 컨트롤러!!!!!!!!::::::::::::" + newsId);
		brdNewsCMO.increaseCount(newsId);
        return "조회수 증가 완료";
    }
	
   }
