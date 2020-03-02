<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>您好Springboot</title>
</head>
<body>
	<table border="1px" width="65%" align="center">
		<tr>
			<td colspan="6" align="center"><h3>学生信息</h3></td>
		</tr>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th></th>
		</tr>

<%--		el表达式取值从域中获取 四大作用域:page request session context --%>
		<c:forEach items="${userList}" var="u">
			<tr>
				<th>${u.id}</th>
				<th>${u.name}</th>
				<th>${u.age}</th>
				<th>${u.sex}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>