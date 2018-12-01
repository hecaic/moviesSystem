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
<style >
span:before{
    content:"* ";
    color:red;
</style>
<script type="text/javascript">
	$(function(){
		$("#updatefilm").click(function(){
			
			var filmState=$("#filmState").val();var price=$("#price").val();
			var jianJie=$("#jianJie").val();
			
			if(filmState==""||filmState==null){
				alert("播放状态不能为空");return false;
			}
			if(price==""||price==null){
				alert("价格不能为空");return false;
			}
			if(jianJie==""||jianJie==null){
				alert("简介不能为空");return false;
			}
		});
	});
</script>
</head>
<body>
<form action="Filmupdate" method="post">
<table class="table table-bordered table-hover">
           <div class="modal-header">  
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">  
                    ×  
                </button>  
                <h4 class="modal-title" id="myModalLabel">  
                   <h3> 修改信息</h3>
                </h4>  
            </div>  
      
           
     
		
		<input type="hidden" name="filmId" value="${film.getFilmId()}" class="form-control" />
		
	<div class="form-group">
		<label for="filmName">电影名</label>
		<input type="text" name="filmName" value="${film.getFilmName()}" class="form-control" disabled="true" />
		</div>
		<div class="form-group"> 
		<label for="filmState">状态</label>
		<input type="text" name="filmState" id="filmState" value="${film.getFilmState()}" class="form-control">
		</div>
		<div class="form-group"> 
		<label for="price">票价</label>
		<input type="text" name="price" id="price" value="${film.getPrice()}" class="form-control">
		</div>
		
		<div class="form-group"> 
		<label for="jianJie">简介</label>
		<input type="text" name="jianJie" id="jianJie" value="${film.getJianJie()}" class="form-control">
		</div>
		<input type="submit" id="updatefilm" value="提交" class="btn btn-success">
		<input type="reset" value="重置 " class="btn btn-danger">
</table>
</form>
  
</body>
</html>