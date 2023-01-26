package com.itbank.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itbank.model.HomplusDTO;
import com.itbank.service.HomplusService;

@RestController
public class HomeplusController {

	@Autowired private HomplusService homplusService;
	
	// 자바 객체를 JSON 형식에 맞는 문자열로 변환할 수 있는 객체
	private ObjectMapper mapper = new ObjectMapper();
	
	@GetMapping("/homeplus/product")
	public String productList() throws IOException {
		// 자바 객체를 JSON 규칙에 맞게, 문자열 형태로 변환하여 반환한다.
		// 자바 객체를 JSON 문자열로 변환 -> (JS에서는 JSON문자열을 자바스크립트 객체로 변환)
		List<HomplusDTO> list = homplusService.getProductList();
		String jsonString = mapper.writeValueAsString(list);
		System.out.println(jsonString);
		return jsonString;
	}
}
