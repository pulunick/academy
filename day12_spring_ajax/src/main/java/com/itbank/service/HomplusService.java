package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.HomplusDTO;
import com.itbank.repository.HomplusDAO;

@Service
public class HomplusService {

	@Autowired private HomplusDAO dao;
	
	public List<HomplusDTO> getProductList() {
		return dao.getProductList();
	}

}
