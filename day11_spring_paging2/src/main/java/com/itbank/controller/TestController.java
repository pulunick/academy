package com.itbank.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.TestService;

@Controller
public class TestController {
	
	@Autowired private TestService testService;
	
	@GetMapping("/ex01")
	public ModelAndView ex01() {
		ModelAndView mav = new ModelAndView();
		String version = testService.getVersion();
		Date sysDate = testService.getSysDate();
		List<HashMap<String, Object>> list = testService.getMemberList();
		mav.addObject("version", version);
		mav.addObject("sysDate", sysDate);
		mav.addObject("list", list);
		return mav;
	}

}
