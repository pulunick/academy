package com.itbank.service;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDTO;
import com.itbank.model.Paging;
import com.itbank.repository.BoardDAO;

@Service
public class BoardService {

	@Autowired private BoardDAO dao;
	
	private final String saveDirectory = "D:\\board2";
	
	public BoardService() {
		File dir = new File(saveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}
	
	public List<BoardDTO> getListAll(Paging paging) {
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("offset", paging.getOffset());
		param.put("perPage", paging.getPerPage());
		
		return dao.selectAll(param);
	}

	public BoardDTO get(int idx) {
		dao.updateViewCount(idx);
		return dao.selectOne(idx);
	}

	public int write(BoardDTO dto) {
		if(dto.getFile().getOriginalFilename() == "") {
			return dao.insert(dto);
		}
		return dao.insert(dto);
	}

	public int modify(BoardDTO dto) {
		return dao.modify(dto);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	public int getBoardCount() {
		return dao.selectBoardCount();
	}

}
