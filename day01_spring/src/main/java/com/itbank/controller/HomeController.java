package com.itbank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 스프링 빈으로 등록되어 있어야 상호작용이 가능하다.

@Controller
public class HomeController {
	
	// DispatcherServlet이 받은 요청을 분담하여 처리한다.
	// 어떤 요청을 받았는지에 따라, 서로 다른 컨트롤러의 함수를 실행한다.(응답을 만들어야 한다)
	// 요청 = value , method GET으로 받을 시 home함수를 실행한다.
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(HttpServletRequest request) {	//DispatcherServlet이 넘겨준다.(넘겨줄 수 있는 것을 매개변수로 적어야 한다)
		// request, response, session 을 매개변수로 받을 수 있다
		
		return "home";	// forward할 jsp의 이름을 문자열로 반환
	}

}
