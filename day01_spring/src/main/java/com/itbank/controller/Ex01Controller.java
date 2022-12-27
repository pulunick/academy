package com.itbank.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex01Controller {
	
	@RequestMapping(value = "/ex01", method = RequestMethod.GET)
	public void ex01() {}
	
	// 가장 기본적인 반환형은 String이며, 포워딩할 jsp의 이름을 가리킨다
	// 반환형이 void라면, 요청주소 문자열을 활용하여 포워딩할 jsp의 이름을 찾는다
	// 주소 맨 앞의 /는 제거하고, /WEB-INF/views/ex01.jsp를 찾아서 포워드한다
	// 새로 추가된 함수는 반드시 톰캣을 재시작해야 함수가 매핑되어 올라간다 => 스프링은 프로젝트가 시작할때 모든 것이 준비되기 때문 
	
	// 같은 주소라도 요청 메서드에 따라서 서로 다른 작동으로 구분한다.
	
	@RequestMapping(value = "/ex01", method = RequestMethod.POST)
	public String ex01(HttpServletRequest request) throws IOException {
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		String adult = age >= 20 ? "성인" : "미성년자";
		String msg = String.format("%s의 나이는 %d살이고, %s입니다", name, age, adult);
		
		request.setAttribute("msg", msg);
		
		return "ex01-result";
	}
}
