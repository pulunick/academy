<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="day10.Student1" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
<style type="text/css">
	table {
		border: 2px solid black;
		border-collapse: collapse;
	}
	thead th {
		background-color: #dadada;
	}
	td, th {
		padding: 10px 20px;
		border: 1px solid greay;
	}
</style>


</head>
<body>

<h1>Database의 내용을 jsp에서 table로 출력하기</h1>
<hr>

<table>
	<thead>
		<tr>
			<th>NAME</th>
			<th>KOR</th>
			<th>ENG</th>
			<th>MAT</th>
		</tr>
	</thead>
	<tbody>
	<%
		// sqlplus c##itbank/it@192.168.1.100:1521/xe
		String sql = "select * from student1";
	
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");	// ojdbc8.jar
		
		// DB 연결할때 고정적으로 사용하는 구문
		Connection conn = DriverManager.getConnection(url, user, password);	// 연결
		Statement stmt = conn.createStatement();		// 상태
		ResultSet rs = stmt.executeQuery(sql);			// 결과
		
		while(rs.next()) {	// sc.hasNextLine();	다음줄이 있으면 true 없으면 false 한줄당 가져옴.
			String name = rs.getString("name");	// 현재 줄에서 name의 값을 문자열로 가져온다
			int kor = rs.getInt("kor");			// 현재 줄에서 kor의 값을 정수로 가져온다
			int eng = rs.getInt("eng");			// 현재 줄에서 eng의 값을 정수로 가져온다 
			int mat = rs.getInt("mat");			// 현재 줄에서 mat의 값을 정수로 가져온다
		%>
			<tr>
				<td><%=name %></td>
				<td><%=kor %></td>
				<td><%=eng %></td>
				<td><%=mat %></td>
			</tr>	
		
	<% 
		}	//end of while
			
		rs.close();
		stmt.close();
		conn.close();
		// 만약, 연결을 닫지 않으면, 실행할때마다 연결이 누적되어 오라클에 접속하지 못할 수도 있다
	%>

	</tbody>
</table>


</body>
</html>