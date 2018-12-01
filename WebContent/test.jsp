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
<title>修改影厅信息</title>
</head>
<body>
<form action="Roomupdate" method="post">
<table class="table table-bordered table-hover">
<div class="modal-header">  
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">  
                     ×
                </button>  
                <h3 class="modal-title" id="myModalLabel">  
                   <h3> 修改信息</h3>
                </h3>  
            </div>  
      
	<div class="form-group">
		<label for="roomName">影厅名</label>
		<input type="text" name="roomName" value="${room.getRoomName()}" class="form-control" />
		</div>
		<div class="form-group"> 
		<label for="roomNuber">座位数</label>
		<input type="text" name="roomNuber" value="${room.getRoomNuber()}" class="form-control">
		</div>
		
		
		<input type="submit" value="提交" class="btn btn-success">
		<input type="reset" value="重置 " class="btn btn-danger">
	
	</table>
	</form> 
</body>
</html>