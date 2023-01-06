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

	public int idCheck(String userid) {
		int cnt = dao.idcheck(userid);
		System.out.println("cnt : " + cnt);
		return cnt;
	}

	public int idOverlap(String id) {
		int cnt = dao.idChecks(id);
		System.out.println("cnt :" + cnt);
		return cnt;
	}


}
