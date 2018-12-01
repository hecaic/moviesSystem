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
			<th>订单号</th>
			<th>用户名</th>
			<th>电影名</th>
			<th>购票张数</th>
			<th>单价</th>
			<th>总价</th>
			<th>开始时间</th>
			<th>播放影厅</th>
			<th>座位号</th>
			<th>购票时间</th>
			
		</tr>
	
			<c:forEach items="${userOrder}" var="list">
			<tr>
				<td>${list.getId()}</td>
				<td>${list.getOrderId()}</td>
				<td>${list.getUserName() }</td>
				<td>${list.getFilmName() }</td>
				<td>${list.getNumber() }</td>
				<td>${list.getPrice() }</td>
				<td>${list.getTotalPrice()}</td>
				<td>${list.getStateTime()}</td>
				<td>${list.getRoomName()}</td>
				<td>${list.getSeats()}</td>
				<td>${list.getOrderTime()}</td>
					 <td><a
					
					href="deleteUserOrder?id=${list.getId()}"
					onclick="return confirm('确定退票吗？')" class="btn btn-danger">退票</a></td>
					
					 
     

			</tr>
	</c:forEach>
	</table>
	<!-- *************** 创建用户modal框开始 --> 

	<!-- *************** 创建用户modal框结束 -->
</body>

</html>