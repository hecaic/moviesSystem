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
 
	<table class="table table-bordered table-hover">
		<tr>
	        <th>序号</th>
			<th >开始时间点</th>
			
		</tr>
	
			<c:forEach items="${listFindStarTime}" var="list">
			<tr>
				<td style="text-align:center">${list.getId()}</td>
				<td style="text-align:center">${list.getStarTime()}</td>
				
					 <td style="text-align:center;width: 518px;"><a
					
					href="deleteTimePoint?id=${list.getId()}"
					onclick="return confirm('确定删除该场次吗？')" class="btn btn-danger">删除</a></td>
					
					 
     

			</tr>
	</c:forEach>
	
	</table>
	
	<form action="listTimeAll" method="post">
 <input type="submit" name="submit"  value="返回" style=" width: 166px; height: 56px;margin-left: 550px;background-color:#008800; color:white;" />
 </form>
</body>

</html>