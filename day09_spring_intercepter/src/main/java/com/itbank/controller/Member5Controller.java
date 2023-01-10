package com.itbank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.Member5DTO;
import com.itbank.service.Member5Service;

@Controller
public class Member5Controller {

	@Autowired private Member5Service member5Service;
	
	@GetMapping("/join")
	public ModelAndView join() {
		
		System.out.println("handle");
		
		ModelAndView mav = new ModelAndView("join");
		List<Member5DTO> list = member5Service.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	@PostMapping("/join")
	public String join(Member5DTO dto) {
		int row = member5Service.add(dto);
		System.out.println(row != 0 ? "가입 성공" : "실패");
		return "redirect:/join";
	}
	
	@PostMapping("/idOverlap")
	@ResponseBody
	public int idOverlap(@RequestParam("id") String id) {
		//@RequestParam는 요청의 특정 파라미터 값을 찾아낼 때 사용하는 어노테이션
		int cnt = member5Service.idOverlap(id);	//서비스에 있는 idOverlap 호출.
		System.out.println("컨트롤러:" + cnt);
		return cnt;
	}
	
	@GetMapping("/login") 
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@PostMapping("/login")
	public ModelAndView login(Member5DTO dto, HttpSession session, String url) {
		ModelAndView mav = new ModelAndView();
		
		System.out.println("로그인 이후 이동할 주소 : " + url);
		Member5DTO login = member5Service.login(dto);
		session.setAttribute("member", login);
		
		if(url == null) {
			session.setAttribute("member", login);
			mav.addObject("msg", login != null ? "로그인 성공" : "아이디와 비번을 확인해주세요");
			mav.addObject("url", login != null ? "/day09_spring_intercepter/" : "/day09_spring_intercepter/login");
			mav.setViewName("alert");
		}else {
			mav.addObject("msg", "로그인 성공");
			mav.addObject("url", url);
			mav.setViewName("alert");
		}
		return mav;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
