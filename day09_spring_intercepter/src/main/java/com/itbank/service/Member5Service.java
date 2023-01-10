package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.Member5DTO;
import com.itbank.repository.Member5DAO;

@Service
public class Member5Service {
	
	@Autowired private Member5DAO dao;

	public List<Member5DTO> getList() {
		return dao.getList();
	}

	public int add(Member5DTO dto) {
		return dao.insert(dto);
	}

	public int idOverlap(String id) {
		return dao.idcheck(id);
	}

	public Member5DTO login(Member5DTO dto) {
		return dao.login(dto);
	}

}
