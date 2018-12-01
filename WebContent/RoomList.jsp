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
  <button class="btn btn-primary" data-toggle="modal"
		data-target="#addRoomModal">添加影厅</button> 
	<table class="table table-bordered table-hover">
		<tr>
	        <th>序号</th>
			<th>影厅名</th>
			<th>影厅座位数</th>
			
		</tr>
	
			<c:forEach items="${Roomlist }" var="item">
			<tr>
				<td>${item.getId()}</td>
				<td>${item.getRoomName()}</td>
				<td>${item.getRoomNuber() }</td>
				
				<td><a
					href="FindByRoomId?id=${item.getId()}"
					class="btn btn-primary" data-toggle="modal" data-target="#myModal" >修改</a>
					 <a href="Roomdelete?id=${item.getId()}"
					onclick="return confirm('确定删除吗？')" class="btn btn-danger">删除</a></td>
					
					 
     

			</tr>
	</c:forEach>
	</table>

	<!-- *************** 修改用户modal框开始 --> 
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
           <form action="Roomupdate" method="post">
       
	<div class="form-group">
		<label for="roomName">影厅</label>
		<input type="text" name="roomName" value="${room.getRoomName()}" class="form-control" />
		</div>
		<div class="form-group"> 
		<label for="roomNuber">座位数</label>
		<input type="text" name="roomNuber" value="${room.getRoomNuber()}" class="form-control">
		</div>
		
		
		<input type="submit" value="提交" class="btn btn-success">
		<input type="reset" value="重置 " class="btn btn-danger">
	</form> 
        </div><!-- /.modal-content -->  
    </div><!-- /.modal -->  
</div>  

	<!-- *************** 创建用户modal框结束 -->
	
	
	
	<!-- *************** 修改用户modal框开始 --> 
<div class="modal fade" id="addRoomModal" tabindex="-1" role="dialog" aria-labelledby="addRoomModalLabel" aria-hidden="true">  
    <div class="modal-dialog">  
        <div class="modal-content">  
            <div class="modal-header">  
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">  
                    ×  
                </button>  
                <h4 class="modal-title" id="myModalLabel">  
                   <h3> 添加影厅</h3>
                </h4>  
            </div>  
           <form action="Roomadd" method="post">
      
	<div class="form-group">
		<label for="roomName">影厅</label>&nbsp;
		<input type="text" id="roomName" name="roomName" placeholder="请输入影厅名" class="form-control" >
		</div>
		<div class="form-group"> 
		<label for="roomNuber">座位数</label>
		<input type="text" id="roomName" name="roomNuber" placeholder="请输入影厅名" class="form-control">
		</div>
		
		
		<input type="submit" value="提交" class="btn btn-success">
		<input type="reset" value="重置 " class="btn btn-danger">
	</form> 
        </div><!-- /.modal-content -->  
    </div><!-- /.modal -->  
</div>  

	<!-- *************** 创建用户modal框结束 -->
</body>

</html>