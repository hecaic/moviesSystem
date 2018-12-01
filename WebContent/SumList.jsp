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
<title>综合统计</title>
</head>
<body>

	<table class="table table-bordered table-hover">
		<tr>
	        <th>序号</th>
	        <th>电影名</th>
	        <th>票房</th>
			
			
			
		</tr>
	
			<c:forEach items="${list }" var="list" varStatus="count">
			
			 <c:if test="${count.count%3==1}">
			<tr>
		</c:if>
				<td>${list}</td>
				
				<c:if test="${count.count%3==0}">
			</tr>
			</c:if>
				
					
	</c:forEach>
	</table>
	<!-- *************** 创建用户modal框开始 --> 

	<!-- *************** 创建用户modal框结束 -->
</body>

</html>