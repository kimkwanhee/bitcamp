<%@page import="bitcamp.java106.pms.domain.Classroom"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>게시물 보기</title>
</head>
<body>
<div id='header'>
<a href='/bitcamp-javaproject/auth/login'>로그인</a></div>
<h1>게시물 보기(MVC)</h1>
<%
Classroom classroom = (Classroom)request.getAttribute("classroom");
%>
<form action='update' method='post'>
<table border='1'>
<tr><th>번호</th><td>
    <input type='text' name='no' value='<%=classroom.getNo()%>' readonly></td></tr>
<tr><th>강의명</th>
    <td><input type='text' name='title' value='<%=classroom.getTitle()%>'></td></tr>
<tr><th>시작일</th><td><%=classroom.getStartDate()%></td></tr>
<tr><th>종료일</th><td><%=classroom.getEndDate()%></td></tr>
<tr><th>강의실</th><td><%=classroom.getRoom()%></td></tr>
</table>
<p>
<a href='list'>목록</a>
<button>변경</button>
<a href='delete?no=<%=classroom.getNo()%>'>삭제</a>
</p>
</form>
</body>
</html>