package com.itbank.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ReplyDTO;
import com.itbank.repository.ReplyDAO;


@Service
public class ReplyService {
	
	@Autowired private ReplyDAO replydao;

	public List<ReplyDTO> replyList(int idx) {

		return replydao.replyList(idx);
		
	}

	public int writeReply(ReplyDTO dto) {
		return replydao.writeReply(dto);
	}

	public int delete(int idx) {
		return replydao.delete(idx);
	}

}
