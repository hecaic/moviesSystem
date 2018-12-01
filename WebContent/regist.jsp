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
    margin:200px auto;
    font-size:15px;
}
table{
    margin:20px auto;
}
a{
    text-decoration:none;
}
input[type="submit"]{
    background:#228B22;
    color:white;
    font-size:15px;
    font-weight:bold;
    width:120px;
    height:40px;
}
td:first-child{
    text-align:right;
    padding:0 5px;
}
td:only-child{
    text-align:center;
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
</head>

<body>
 <form action="add" method="post">
<div>注册账号</div>
<table>
    <tr><td><span>用户名</span></td><td><input type="text" name="loginname"  /></td></tr>
   
    <tr><td><span>密码</span></td><td><input type="password" name="password"  /></td></tr>  
    <tr><td><span>性别</span></td>
    <td><input type="radio"  name="usersex" value="男" />男
    <input type="radio"  name="usersex" value="女" />女
    </td>
    </tr>
    <tr><td><span>手机号码</span></td><td><input type="text" name="userphone" /></td></tr>
    <tr><td colspan="2"><input type="submit" name="submit"  value="立即注册" /></td></tr>
</table>
</form>
</body>
</html>