package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itbank.model.MemberDTO;
import com.itbank.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired private MemberService memberService;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		List<MemberDTO> list = memberService.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(MemberDTO dto) {
		int row = memberService.insert(dto);
		System.out.println(row != 0 ? "추가 성공" : "추가 실패");
		return "redirect:/list";
	}
	
	@GetMapping("/detail")
	public ModelAndView detail(int idx) {
		ModelAndView mav = new ModelAndView();
		
		MemberDTO dto = memberService.getSelectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("idx") int idx, RedirectAttributes ra) {
		int row = memberService.delete(idx);
		System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
		ra.addFlashAttribute("message","delSuccess");
		return "redirect:/list";
	}
	
	@GetMapping("/update")
	public ModelAndView update(int idx) {
		ModelAndView mav = new ModelAndView();
		
		MemberDTO dto = memberService.getSelectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@PostMapping("/update")
	public String update(MemberDTO dto, RedirectAttributes ra) {
		int row = memberService.update(dto);
		System.out.println(row != 0 ? "수정 성공" : "수정 실패");
		ra.addFlashAttribute("messages","updateSuccess");
		return "redirect:/list";
	}
	
	
	
	

}
