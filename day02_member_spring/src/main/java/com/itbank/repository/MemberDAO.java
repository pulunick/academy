package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.MemberDTO;

public interface MemberDAO {
	
	@Select("select * from member5")
	List<MemberDTO> selectList();

	@Insert("INSERT INTO member5 (userid, userpw, username, birth, gender) values (#{userid}, #{userpw}, #{username}, #{birth}, #{gender})")
	int insert(MemberDTO dto);

	@Select("select * from member5 where idx=#{idx}")
	MemberDTO getSelectOne(int idx);

	@Delete("delete from member5 where idx=#{idx}")
	int delete(int idx);

	@Update("update member5 set userid=#{userid}, userpw=#{userpw}, username=#{username}, birth=#{birth}, gender=#{gender} where idx=#{idx}")
	int update(MemberDTO dto);
	
	

}
