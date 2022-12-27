package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.MultiplicationService;

@Controller
@RequestMapping("/multiplication")
public class MultiplicationController {
	
	@Autowired private MultiplicationService multi;
	
	@GetMapping
	public ModelAndView multi() {
		// 버튼을 누르는 순간 무엇*무엇 인지 바로 등장해야하기때문에 걸어준다.
		ModelAndView mav = new ModelAndView();
		
		multi.initialize();
		int answer = multi.getAnswer();
		int answer2 = multi.getAnswer2();
		
		mav.addObject("answer", answer);
		mav.addObject("answer2", answer2);
		return mav;
	}
	
	@PostMapping
	public ModelAndView multi(int user) {
		ModelAndView mav = new ModelAndView();
		
		String status = multi.getStatus(user);
		int answer = multi.getAnswer();
		int answer2 = multi.getAnswer2();
		
		switch(status) {
		case "Correct":
			mav.setViewName("multiCorrect");
			break;
		}
		mav.addObject("status", status);
		mav.addObject("answer", answer);
		mav.addObject("answer2", answer2);
		return mav;
	}

}
