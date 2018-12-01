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
<title>用户订单表</title>
</head>
<body>
<form action="FindUserList" method="post" >
<div><p style="height: 40px;background-color:#123456;padding-left: 800px;"><span style="color:#ffffff">搜索：</span>
<input type="text" value="" name="userName" id="userName" placeholder="请输入用户名" style=" margin-top: 7px;">
<input type="submit" value="查询" /></p></div>
</form>

	<table class="table table-bordered table-hover">
		<tr>
	        <th>序号</th>
			<th>订单号</th>
			<th>用户名</th>
			<th>电影名</th>
			<th>购票张数</th>
			<th>单价</th>
			<th>总价</th>
			<th>购票时间</th>
		</tr>
	
			<c:forEach items="${Orderlist }" var="list">
			<tr>
				<td>${list.getId()}</td>
				<td>${list.getOrderId()}</td>
				<td>${list.getUserName() }</td>
				<td>${list.getFilmName() }</td>
				<td>${list.getNumber() }</td>
				<td>${list.getPrice() }</td>
				<td>${list.getTotalPrice() }</td>
				<td>${list.getOrderTime() }</td>
					 <td><a
					
					href="deleteOrder?id=${list.getId()}"
					onclick="return confirm('确定删除吗？')" class="btn btn-danger">删除</a></td>
					
					 
     

			</tr>
	</c:forEach>
	</table>
	<!-- *************** 创建用户modal框开始 --> 

	<!-- *************** 创建用户modal框结束 -->
</body>

</html>