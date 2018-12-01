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
<script type="text/javascript">
	$(function(){
		$("#updatema").click(function(){
			
			var name=$("#loginname").val();var pwd=$("#password").val();
			if(name==""||name==null){
				alert("用户名不能为空");return false;
			}
			if(pwd==""||pwd==null){
				alert("密码不能为空");return false;
			}
		});
	});
</script>
</head>
<body>

	<table class="table table-bordered table-hover">
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>密码</th>
		
		</tr>
	
		
			<tr>
				<td>${manage.getUserid()}</td>
				<td>${manage.getLoginname()}</td>
				<td>${manage.getPassword() }</td>
			
				<td><a 
					 class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">修改</a>
					 </td>
					 
     

			</tr>
	
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
           <form action="Maupdate" method="post">
      
		
		<input type="hidden" name="userid" value="${manage.getUserid()}" class="form-control" />
		
	<div class="form-group">
		<label for="loginname">用户名</label>
		<input type="text" name="loginname" id="loginname" value="${manage.getLoginname()}" class="form-control" />
		</div>
		<div class="form-group"> 
		<label for="password">密码</label>
		<input type="text" name="password" id="password" value="${manage.getPassword()}" class="form-control">
		</div>
		
		
		<input type="submit" id="updatema" value="提交" class="btn btn-success">
		<input type="reset" value="重置 " class="btn btn-danger">
	</form> 
        </div><!-- /.modal-content -->  
    </div><!-- /.modal -->  
</div>  

	<!-- *************** 创建用户modal框结束 -->
</body>

</html>