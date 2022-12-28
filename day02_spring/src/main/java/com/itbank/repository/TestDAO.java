package com.itbank.repository;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDAO {
	// 인터페이스는 추상 메서드만 포함할 수 있으므로, 함수의 내용을 작성할 수 없다
	// 1) xml 설정 파일로 연결시키기			(상세한 쿼리문을 작성할 때, 사용빈도 높음)
	// 2) 어노테이션을 이용하여 SQL문 작성하기	(단순한 쿼리문을 작성할 때, 사용빈도 낮음)
	
	
	// 인터페이스라서 바디를 적을 수 없다.
	@Select("select banner from v$version")
	String selectVersion();

}
