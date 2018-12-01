
<!--管理员查看电影信息页面 -->
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
<title>电影</title>
</head>
<body>
 
<table class="table table-bordered table-hover">
       <!--   <tr><a href="AddFilm.jsp"><input type="button" value="添加电影"></a></tr>-->
		<tr>
	        <th>序号</th>
			<th>电影名</th>
			<th>影片类型</th>
			<th>播放类型</th>
			<th>语言</th>
			<th>片长</th>
			<th>状态</th>
			<th>票价</th>
			<th>导演</th>
			<th>主演</th>
			<th>图片</th>
			<th>影厅</th>
			<th>简介</th>
			<th>操作</th>
		</tr>
	
			<c:forEach items="${Movielist }" var="item">
			<tr>
			
				<td>${item.getFilmId()}</td>
				<td>${item.getFilmName()}</td>
				<td>${item.getFilmType() }</td>
				<td>${item.getPlayType() }</td>
				<td>${item.getFilmLanguage() }</td>
				<td>${item.getFilmLong() }</td>
				<td>${item.getFilmState() }</td>
				<td>${item.getPrice() }</td>
				<td>${item.getDirector() }</td>
				<td>${item.getActor() }</td>
				<td>${item.getFilmImg() }</td>
				<td>${item.getAddress() }</td>
				<td>${item.getJianJie() }</td>
				
					 
					 
     <td><a href="FindByFilmId?filmId=${item.getFilmId()}"
					class="btn btn-primary" data-toggle="modal" data-target="#myModal" >修改</a>
     <a href="Filmdelete?filmId=${item.getFilmId()}"
					onclick="return confirm('确定删除吗？')" class="btn btn-danger">删除</a></td>

			</tr>
	</c:forEach>
	</table>
	<!-- *************** 创建修改modal框开始 --> 
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">  
    <div class="modal-dialog">  
        <div class="modal-content">  
            <div class="modal-header">  
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">  
                    ×  
                </button>  
                <h4 class="modal-title" id="myModalLabel">  
                   <h3> 修改信息</h3>
                </h4>  
            </div>  
         
        </div><!-- /.modal-content -->  
    </div><!-- /.modal -->  
</div>  

	<!-- *************** 创建用户modal框结束 -->
</body>

</html>