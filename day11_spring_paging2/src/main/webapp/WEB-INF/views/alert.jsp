<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<script>
    const msg = "<c:out value='${msg}'/>";
    const url = "<c:out value='${url}'/>";
    alert(msg);
    location.href = url;
</script>

</body>
</html>