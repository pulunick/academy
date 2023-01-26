package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.itbank.model.HomplusDTO;

public interface HomplusDAO {

	@Select("select * from homeplus order by idx")
	List<HomplusDTO> getProductList();

}
