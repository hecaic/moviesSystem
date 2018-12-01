<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="js/Bootstrap/css/bootstrap.min.css" />
<script type="text/javascript"
	src="js/jquery-1.11.0.js"></script>
<script type="text/javascript"
	src="js/Bootstrap/js/bootstrap.min.js"></script>
<title>登陆页面</title>
<style>
div{
   background:#009FCC;
    font-size:24px;
    padding:5px;
    color:white;
}
form{
    background: #F8F8FF ;
    border:#357FC4 solid 1px;
    color:#575454;  
    width:400px;
    margin:20px auto;
    font-size:15px;
}
table{
    margin:10px auto;

}
a{
    text-decoration:none;
}
input[type="submit"]{
    background:#228B22;
    color:white;
    font-size:10px;
    font-weight:bold;
    width:120px;
    height:40px;
    
}

input[type="button"]{
    background:#228B22;
    color:white;
    font-size:10px;
    font-weight:bold;
    width:120px;
    height:40px;
    
}

td:first-child{
    text-align:center;
    padding:0 5px;
}
td:only-child{
    text-align:right;
    font-size:12px;
}
span:before{
    content:"* ";
    color:red;
}
input[type="text"]:read-only{
    border:#888484 solid 2px;
    background:#888484;
    font-weight:bold;   
}
input[type="text"]:hover{
    background:#EFD9AC;
}
</style>
<script type="text/javascript">
	$(function(){
		$("#sub").click(function(){
			
			var name=$("#d1").val();var pwd=$("#d2").val();
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
<body  background="img/5317e6677c6fc.jpg">

	<form action="Frontlogin" method="post" style="margin-top: 200px;">
	
	   <div>登陆界面</div>
	
	 <table style=" height: 160px;"   >
	   
		<tr>
			<td ><span>登录名：</span></td>
		
			<td ><input type="text" id="d1" name="loginname" ></td>
		</tr>
           <tr>
           <td ><span>密码：</span></td>
           
           <td ><input type="password" id="d2" name="password"></td>
          
        </tr>
        <tr >
        
           <td colspan="2"><input type="submit" id="sub" value="登陆" style="width: 66px;"><a href="regist.jsp"><input type="button" value="注册" style="width: 66px;"></a>
           <a href="manage.jsp"><input type="button" value=">进入后台" style="width: 86px;"></a>
           </td>
          
           </tr>
           
          
          
         
		
		</table>
	
	</form>
	
</body>

</html>