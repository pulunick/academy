package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.service.Member5Service;

@RestController
public class AjaxController {
	
	@Autowired private Member5Service member5Service;
	
	@GetMapping(value="/dupCheck/{inputId}", produces="plain/text;charset=utf-8")
	@ResponseBody
	public String dupCheck(@PathVariable("inputId") String inputId) {
		int row = member5Service.dupCheck(inputId);
		String msg = row == 1 ? "이미 사용중인 ID 입니다" : "사용 가능한 ID 입니다";
		msg = row + ":" + msg;
		return msg;
	}

}
