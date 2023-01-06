package com.itbank.controller;

import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


import org.apache.ibatis.type.TypeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.Member5DTO;
import com.itbank.service.Member5Service;

@Controller
public class Member5Controller {
	
	@Autowired private Member5Service member5service;	
	
	@GetMapping("/ex01")
	public ModelAndView ex01() {
		ModelAndView mav = new ModelAndView("ex01");
		List<Member5DTO> list = member5service.getList();
		mav.addObject("list", list);
		return mav;
	}
	// 특정 요청이 발생헀을 때, 실행되는 함수
	@PostMapping("/ex01")
	public String ex01(Member5DTO dto) {
		int row = member5service.add(dto);
		System.out.println(row != 0 ? "가입 성공" : "실패");
		return "redirect:/ex01";
	}
	
	//아이디 중복체크
	@PostMapping("/idCheck")
	@ResponseBody
	public int idCheck(@RequestParam("userid") String userid) {
		int cnt = member5service.idCheck(userid);
		return cnt;
	}
	
	
	@PostMapping("/idOverlap")
	@ResponseBody
	public int idOverlap(@RequestParam("id") String id) {
		//@RequestParam는 요청의 특정 파라미터 값을 찾아낼 때 사용하는 어노테이션
		int cnt = member5service.idOverlap(id);	//서비스에 있는 idOverlap 호출.
		System.out.println("컨트롤러:" + cnt);
		return cnt;
	}
	
	// 특정 예외가 발생했을 때, 실행되는 함수
	// 중복 아이디 가입이 발생했을 경우 예외를 처리하는 함수
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ModelAndView duplicatedId(SQLIntegrityConstraintViolationException e) {
		System.out.println("예외 발생: " + e);
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("msg", "이미 사용중인ID입니다");
		return mav;
	}

	@ExceptionHandler(TypeException.class)
	public ModelAndView typeException(TypeException e) {
		String message = e.getMessage();
		message = message.substring(message.indexOf("property='"), message.indexOf(","));
		message = message.substring(message.indexOf("'") +1, message.lastIndexOf("'"));
		System.out.println(message);
		
		String msg = "[%s] 값이 필수로 입력되어야 합니다.";
		msg = String.format(msg, message);
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("msg", msg);
		return mav;
	}

}
