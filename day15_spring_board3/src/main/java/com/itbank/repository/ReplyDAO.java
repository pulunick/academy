package com.itbank.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.ReplyDTO;


@Repository
public interface ReplyDAO {
	
	List<ReplyDTO> replyList(int idx);

	int writeReply(ReplyDTO dto);

	int delete(int idx);
}
