package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BookDTO;
import com.itbank.repository.BookDAO;

@Service
public class BookService {
	
	@Autowired private BookDAO dao;

	public List<BookDTO> getList() {
		return dao.selectList();
	}

	public BookDTO getSelectOne(int idx) {
		return dao.selectOne(idx);
	}

	public int insert(BookDTO dto) {
		String name2 = dto.getName().replace(" ", "");
		dto.setName2(name2);
		return dao.insert(dto);
	}

	public int update(BookDTO dto) {
		String name2 = dto.getName().replace(" ", "");
		dto.setName2(name2);
		return dao.update(dto);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	public List<BookDTO> getSearchList(String search, String keyword) {
		keyword = keyword.replace(" ", "");
		return dao.searchList(search, keyword);
	}

}
