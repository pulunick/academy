package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itbank.model.BookDTO;
import com.itbank.service.BookService;

@Controller
public class BookController {
	
	@Autowired private BookService bookService;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		List<BookDTO> list = bookService.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	@PostMapping("/list")
	public ModelAndView searchList(String search, String keyword) {
		ModelAndView mav = new ModelAndView();
		
		List<BookDTO> list = bookService.getSearchList(search, keyword);
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/detail")
	public ModelAndView detail(int idx) {
		ModelAndView mav = new ModelAndView();
		
		BookDTO dto = bookService.getSelectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@GetMapping("/insert")
	public void insert() {}
	
	@PostMapping("/insert")
	public String insert(BookDTO dto, RedirectAttributes rs) {
		int row = bookService.insert(dto);
		System.out.println(row != 0 ? "추가성공" : "추가실패");
		rs.addFlashAttribute("mes","insertSuccess");
		return "redirect:/list";
	}
	
	@GetMapping("/update")
	public ModelAndView update(int idx) {
		ModelAndView mav = new ModelAndView();
		
		BookDTO dto = bookService.getSelectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@PostMapping("/update")
	public String update(BookDTO dto, RedirectAttributes rs) {
		int row = bookService.update(dto);	
		System.out.println(row != 0 ? "수정 성공" : "수정 실패");
		rs.addFlashAttribute("messages","updateSuccess");
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("idx") int idx, RedirectAttributes rs) {
		int row = bookService.delete(idx);
		System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
		rs.addFlashAttribute("message","delSuccess");
		return "redirect:/list";
	}

}
