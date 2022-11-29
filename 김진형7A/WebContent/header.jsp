<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import= "김진형7A.*"%>
<%
	request.setCharacterEncoding("UTF-8");
	pageContext.setAttribute("cpath", request.getContextPath());
	
	Handler hd = (Handler)application.getAttribute("handler");
	if(hd == null) {
		hd = new Handler();
		application.setAttribute("handler", hd);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<style>
	*{
    box-sizing: border-box; 
    outline: none; 
}
	header, nav, main, aside, section {
		margin: 0;
		padding: 0;
	}
	body{
    background-color: #f5f6f7;
    line-height: 1.5em;
    color : #222;
    margin: 0;
	}
	a {
		text-decoration: none;
		color: inherit;
	}
	h1, h2, h3, h4, h5, h6 {
		margin: 0;
		padding: 0;
	}
	header {
		background-color: #00c73c;
		padding:20px;
		color: white;
	}
	h1 {
		text-align: center;
	}
	nav {
		display: flex;
   		width: 900px;
   		margin:auto;
	}
	img {
		width: 100%;
		margin: 20px auto;
	}
	header > a {
		text-align: center;
	}
	nav > ul {
		display: flex;
		width: 100%;
		justify-content: space-around;
		list-style: none;
		padding: 0;
	}
	nav > ul > li > a {
		font-size: 24px;
		font-weight: bold;
	}
	section {
    	width: 480px;
	    margin: auto; 
    	padding: 0 20px;
    	margin-bottom: 20px;
    	font-family: 'Noto Sans KR', sans-serif;
    	font-size:14px;
	}
	
	p {
		padding: 10px 20px;
	}
	table {
		border-collapse: collapse;
		width: 100%;
		margin: 20px auto; 
		text-align: center;
	}
	thead th {
		background-color: #00c73c;
		color: white;
		padding: 5px 10px;
	}
	tbody td {
		padding: 5px 10px;
	}
	tbody > tr:hover {
		background-color: #00c73c;
		color: white;
		cusor: pointer;
	}
	button {
		cusor: pointer;
	}
	tbody > tr > td:nth-child(4),
	tbody > tr > td:nth-child(5) {
		visibility: hidden;
	}
	tbody > tr:hover > td:nth-child(4),
	tbody > tr:hover > td:nth-child(5) {
		visibility: visible;
	}
	input[type="text"] {
	    border: 1px solid #dadada;
    	padding: 15px;
    	width: 100%;
    	margin-bottom: 5px;
	}	
	input[type="submit"],[type="button"] {
		background-color: #03C75A;
		color:#fff;
		font-size: 15px;
		font-weight: bold;
		cursor: pointer;
		width: 100%;
		margin-bottom: 5px;
	}
	
	
</style>
</head>
<body>

<header>
	<h1><a href="${cpath }">전화번호부</a></h1>
	<nav>
			<ul>
				<li><a href="${cpath }/list.jsp">전체 목록</a>
				<li><a href="${cpath }/add.jsp">생성</a>
			</ul>
		</nav>
</header>


</body>
</html>