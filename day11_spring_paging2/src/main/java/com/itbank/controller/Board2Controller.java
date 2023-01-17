package com.itbank.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.Board2DTO;
import com.itbank.model.PagingDTO;
import com.itbank.service.Board2Service;

@Controller
public class Board2Controller {
	
	@Autowired private Board2Service board2Service;
	
	@GetMapping("/board2")
	public ModelAndView board(@RequestParam(defaultValue = "1") Integer page) {
		ModelAndView mav = new ModelAndView("board2");
		List<Board2DTO> list = board2Service.getBoard2List(page);
		mav.addObject("list", list);
		
		int boardCount = board2Service.getBoard2Count();
		PagingDTO paging = new PagingDTO(page, boardCount);
		mav.addObject("paging", paging);
		
		return mav;
		
//		if(page == null) {
//			page = 1;
//		}
//		int perPage = 10;
//		// 페이지 수 
//		int pageCount = boardCount / perPage;
//		if(boardCount % perPage != 0) {
//			pageCount += 1;
//		}
//		
//		int pageNum_cnt = 5; // 한 번에 띄울 번호
//		// 표시되는 페이지 번호 중 마지막 번호
//		int endPageNum = (int)(Math.ceil((double)page / (double)pageNum_cnt) * pageNum_cnt);
//
//		// 표시되는 페이지 번호 중 첫번째 번호
//		int startPageNum = endPageNum - (pageNum_cnt - 1);
//		
//		
//		System.out.println(endPageNum);
//		 
//		if(endPageNum > pageCount) {
//			endPageNum = pageCount;
//		}
//		System.out.println(pageCount);
//		
//		System.out.println(endPageNum);
//		
//		boolean prev = startPageNum == 1 ? false : true;
//		boolean next = endPageNum == pageCount ? false : true;
//		
//		// 시작 및 끝 번호
//		mav.addObject("startPageNum", startPageNum);
//		mav.addObject("endPageNum", endPageNum);
//		
//
//		// 이전 및 다음 
//		mav.addObject("prev", prev);
//		mav.addObject("next", next);
//		
//		mav.addObject("pageCount", pageCount);
	
	}
	
	@PostMapping("/board2")
	public ModelAndView seachBoard2(@RequestParam HashMap<String, Object> param, Integer page) {
		ModelAndView mav = new ModelAndView("board2");
		List<Board2DTO> list = board2Service.getSearchList(param, page);
		mav.addObject("list", list);
		
		int boardCount = board2Service.getBoard2Count();
		PagingDTO paging = new PagingDTO(page, boardCount);
		mav.addObject("paging", paging);
		
		return mav;
	}
	
	@GetMapping("/board2/board2_write")
	public String write() {
		return "board2_write";
	}
	
	@PostMapping("/board2/board2_write")
	public ModelAndView addBoard2(Board2DTO dto) {
		ModelAndView mav = new ModelAndView();
		int row = board2Service.addBoard2(dto);
		mav.addObject("msg", row != 0 ? "작성 성공" : "작성 실패");
		mav.addObject("url", row != 0 ? "/day11_spring_paging2/board2?page=1" : "/day11_spring_paging2/board2/board2_write/");
		mav.setViewName("alert");
		return mav;
	}
	
	@GetMapping("/board2_detail/{idx}")
	public ModelAndView board2Detail(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("board2_detail");
		board2Service.Board2ViewCount(idx);
		Board2DTO dto = board2Service.selectOneBoard2(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@GetMapping("/board2/board2_modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("board2_modify");
		Board2DTO dto = board2Service.selectOneBoard2(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@PostMapping("/board2/board2_modify/{idx}")
	public ModelAndView modify(Board2DTO dto, @PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView();
		int row = board2Service.modifyBoard2(dto);
		mav.addObject("msg", row != 0 ? "수정 성공" : "수정 실패");
		mav.addObject("url", row != 0 ? "/day11_spring_paging2/board2_detail/" + idx : "/day11_spring_paging2/board2/board2_modify/" +idx);
		mav.setViewName("alert");
		return mav;
	}
	
	@GetMapping("/board2/board2_delete/{idx}")
	public ModelAndView delete(@PathVariable("idx") int idx, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		int row = board2Service.deleteBoard(idx);
		mav.addObject("msg", row != 0 ? "글 삭제 완료" : "삭제 실패");
		mav.addObject("url", row != 0 ? "/day11_spring_paging2/board2?page=1" : "/day11_spring_paging2/board2/board2_delete/"+ idx);
		mav.setViewName("alert");
		return mav;
	}
}
