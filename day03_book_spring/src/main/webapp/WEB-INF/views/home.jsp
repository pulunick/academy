<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<pre>
create table book3 (
	idx				number				default book3_seq.nextval primary key,
	name			varchar2(100)		not null,
	author			varchar2(100)		not null,
	publisher		varchar2(1000)		not null,
	publishDate		date				not null,
	price			number				check(price between 0 and 50000),
	memo			varchar2(2000)		not null,
	score			number(4, 1)		check (score between 0 and 10)	
);

</pre>




</body>
</html>