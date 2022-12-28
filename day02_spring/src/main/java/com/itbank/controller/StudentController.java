package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itbank.component.HashComponent;
import com.itbank.model.StudentDTO;
import com.itbank.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired private StudentService studentService;
	
	@GetMapping("/ex01")
	public ModelAndView ex01() {
		ModelAndView mav = new ModelAndView();		
		// ModelAndView도 viewName을 지정하지 않으면 void와 동일하게 작동한다.
		
		List<StudentDTO> list = studentService.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/ex02")
	public void ex02() {}
	
	@PostMapping("/ex02")
	public String ex02(StudentDTO dto) {
		// HashComponent Test
		String result = hashComponent.getHash("itbank");
		System.out.println(result);
		
		int row = studentService.insert(dto);
		System.out.println(row != 0 ? "추가 성공" : "추가 실패");
		return "redirect:/ex01";	// 포워드 대신 /ex01 주소로 리다이렉트 한다.
		// if(viewName.startWith("redirect:")) response.sendRedirect("/ex01");
	}
	
	@GetMapping("/ex03")
	public void ex03() {}
	
	@Autowired private HashComponent hashComponent;
	
	@PostMapping("/ex03")
	public String ex03(@RequestParam("name") String name){
		
		int row = studentService.update(name);
		System.out.println(row != 0 ? "수정 성공" : "수정 실패");
		return "redirect:/ex01";
	}
	
	@GetMapping("/ex04")
	public String ex04(@RequestParam("name") String name, RedirectAttributes ra) {
		int row = studentService.delete(name);
		System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
		ra.addFlashAttribute("message","delSuccess");
		return "redirect:/ex01";
	}
	


}
