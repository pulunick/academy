package com.itbank.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.Board2DTO;

@Repository
public interface Board2DAO {

	List<Board2DTO> getBoard2List(HashMap<String, Object> param);

	int addboard2(Board2DTO dto);

	Board2DTO selectOneBoard2(int idx);

	int Board2ViewCount(int idx);

	int modifyBoard2(Board2DTO dto);

	int addboard2WithoutFile(Board2DTO dto);

	int modifyBoard22WithoutFile(Board2DTO dto);

	int getBoard2Count();

	int deleteBoard(int idx);

	List<Board2DTO> getSearchList(HashMap<String, Object> param);


}
