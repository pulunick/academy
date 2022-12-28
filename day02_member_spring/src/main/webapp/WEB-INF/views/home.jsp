<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<details>
	<summary>member5 테이블 SQL</summary>
	<pre>
create SEQUENCE member5_seq
    start with 1
    maxvalue 999999999
    INCREMENT by 1
    NOCACHE
    NOCYCLE;


create table member5 (
    idx         number          default member5_seq.nextval primary key,
    userid      varchar2(100)   unique not null,
    userpw      varchar2(255)   not null,
    username    varchar2(100)   not null,
    birth       date            not null,
    gender      varchar2(20)    check(gender in('남성','여성'))
);
	</pre>
</details>

</body>
</html>