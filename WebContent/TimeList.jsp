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
<title>场次信息</title>
</head>
<body>
 <form action="listFilmname" method="post">
 <input type="submit" name="submit"  value="添加场次" style=" width: 116px;height: 36px;margin-left: 20px;background-color:#0000FF; color:white;" />
 </form>
	<table class="table table-bordered table-hover">
		<tr>
	        <th>序号</th>
			<th>电影名</th>
			<th>播放日期</th>
			
			
		</tr>
	
			<c:forEach items="${listTimeAll}" var="list">
			<tr>
				<td>${list.getId()}</td>
				<td>${list.getFilmName()}</td>
				<td>${list.getTime() }</td>
				<td ><a
					
					href="findByStarTime?id=${list.getId()}"
					class="btn btn-danger">添加时间点</a></td>
					<td ><a
					
					href="listFindStarTime?filmName=${list.getFilmName()}&&time=${list.getTime() }"
					class="btn btn-danger">开始时刻详情</a></td>
					 <td><a
					
					href="Timedelete?id=${list.getId()}"
					onclick="return confirm('确定删除该场次吗？')" class="btn btn-danger">删除</a></td>
					
					 
     

			</tr>
	</c:forEach>
	</table>
	
</body>

</html>