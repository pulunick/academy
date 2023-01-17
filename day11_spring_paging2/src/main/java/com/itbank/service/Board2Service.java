package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.Board2DTO;
import com.itbank.model.PagingDTO;
import com.itbank.repository.Board2DAO;

@Service
public class Board2Service {
	
	@Autowired private Board2DAO dao;
	
	private final String saveDirectory = "D:\\board2";
	
	public Board2Service() {
		File dir = new File(saveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}

	public List<Board2DTO> getBoard2List(Integer page) {
		HashMap<String, Object> param = new HashMap<String, Object>();
		int boardCount = dao.getBoard2Count();
		PagingDTO paging = new PagingDTO(page, boardCount);
		int offset = paging.getOffset();
		int perPage = paging.getPerPage();
		param.put("offset", offset);
		param.put("perPage",perPage);
		return dao.getBoard2List(param);
	}
	
	public List<Board2DTO> getSearchList(HashMap<String, Object> param, Integer page) {
		int boardCount = dao.getBoard2Count();
		PagingDTO paging = new PagingDTO(page, boardCount);
		int offset = paging.getOffset();
		int perPage = paging.getPerPage();
		param.put("offset", offset);
		param.put("perPage", perPage);
		return dao.getSearchList(param);
	}
	
	public int getBoard2Count() {
		return dao.getBoard2Count();
	}

	public int addBoard2(Board2DTO dto) {
		if(dto.getRealUpload().getOriginalFilename() == "") {
			return dao.addboard2WithoutFile(dto);
		}
		else {
			String uploadFileName = dto.getRealUpload().getOriginalFilename();
			String ext1 = uploadFileName.substring(uploadFileName.lastIndexOf("."));
			File dest = new File(saveDirectory, dto.getWriter() + "_upload" + ext1);
		
			try {
				dto.getRealUpload().transferTo(dest);
				dto.setUploadFile(dest.getName());
				return dao.addboard2(dto);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	}

	public Board2DTO selectOneBoard2(int idx) {
		return dao.selectOneBoard2(idx);
	}

	public int Board2ViewCount(int idx) {
		return dao.Board2ViewCount(idx);
	}

	public int modifyBoard2(Board2DTO dto) {
		if(dto.getRealUpload().getOriginalFilename() == "") {
			dto.setUploadFile(dto.getUploadFile());
			return dao.modifyBoard2(dto);
		}
		else {
		String uploadFileName = dto.getRealUpload().getOriginalFilename();
		String ext1 = uploadFileName.substring(uploadFileName.lastIndexOf("."));
		File dest = new File(saveDirectory, dto.getWriter() + "_upload" + ext1);
		try {
			dto.getRealUpload().transferTo(dest);
			dto.setUploadFile(dest.getName());
			return dao.modifyBoard2(dto);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		return 0;
	}

	public int deleteBoard(int idx) {
		return dao.deleteBoard(idx);
	}



}
