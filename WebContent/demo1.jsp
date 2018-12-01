<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="js/jquery-1.11.0.js"></script>
<link rel="stylesheet"
	href="js/Bootstrap/css/bootstrap.min.css" />
<script type="text/javascript"
	src="js/Bootstrap/js/bootstrap.min.js"></script>
<title>用户信息表</title>
</head>
<body>

	<table class="table table-bordered table-hover">
		<tr>
	        <th>序号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>性别</th>
			<th>电话</th>
			<th>操作</th>
		</tr>
	
			<c:forEach items="${list }" var="list">
			<tr>
				<td>${list.getUserid()}</td>
				<td>${list.getLoginname()}</td>
				<td>${list.getPassword() }</td>
				<td>${list.getUsersex() }</td>
				<td>${list.getUserphone() }</td>
				
					 <td><a
					
					href="delete?userId=${list.getUserid()}"
					onclick="return confirm('确定删除吗？')" class="btn btn-danger">删除</a></td>
					
					 
     

			</tr>
	</c:forEach>
	</table>
	
</body>

</html>