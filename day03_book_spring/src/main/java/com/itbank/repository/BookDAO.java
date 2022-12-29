package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.BookDTO;

public interface BookDAO {

	@Select("select * from book3")
	List<BookDTO> selectList();

	@Select("select * from book3 where idx=#{idx}")
	BookDTO selectOne(int idx);

	@Insert("insert into book3(name, name2, author, publisher, publishDate, price, memo, score) values(#{name}, #{name2}, #{author}, #{publisher}, #{publishDate}, #{price}, #{memo}, #{score})")
	int insert(BookDTO dto);

	@Update("update book3 set name=#{name}, name2=#{name2}, author=#{author}, publisher=#{publisher}, publishDate=#{publishDate}, price=#{price}, memo=#{memo}, score=#{score} where idx=#{idx}")
	int update(BookDTO dto);

	@Delete("delete from book3 where idx=#{idx}")
	int delete(int idx);
	
	@Select("select * from book3 where ${search} like '%${keyword}%' ")
	List<BookDTO> searchList(@Param("search") String search, @Param("keyword") String keyword);

}
