<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>jQuery时间选择器插件</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<style type="text/css">
	h3 { font-size: 13px; margin-top:0px; }
		
		.time { display:inline-block; font-size:24px; padding:5px; text-align:center; width:86px; }
</style>
</head>
<body>
<form action="AddStarTmine" method="post">

	<input type="hidden" name="filmName" value="${findByStarTime.getFilmName()}">
  <input type="hidden" name="time" value="${findByStarTime.getTime()}">
	<h3 style="padding-left: 350px;font-size: 30px;">请选择您的时间：</h3>
	<p style="font-size:24px;padding-left: 450px;height: 40px;"> 时间1：<input class="time" type="text" name="starTime" value="00:00" onchange="console.log('Time changed')" /></p>
	<p style="font-size:24px;padding-left: 450px;height: 40px;"> 时间2：<input class="time" type="text" name="a" value="00:00" onchange="console.log('Time changed')" ></p>
 <p style="font-size:24px;padding-left: 450px;height: 40px;"> 时间3：<input class="time" type="text" name="b" value="00:00" onchange="console.log('Time changed')" ></p>
 <p style="font-size:24px;padding-left: 450px;height: 40px;"> 时间4：<input class="time" type="text" name="c" value="00:00" onchange="console.log('Time changed')" ></p>
 <p style="font-size:24px;padding-left: 450px;height: 40px;"> 时间5：<input class="time" type="text" name="d" value="00:00" onchange="console.log('Time changed')" ></p>
	<p style="font-size:24px;padding-left: 455px;"><input type="submit" name="submit" value="确定" style="width: 176px;height: 46px;background-color:#008800; color:white"></p>

 </form>
<script type="text/javascript" src="js/jquery-1.11.0.min.js" ></script>
<script type="text/javascript" src="js/jquery-clock-timepicker.min.js"></script>
<script type="text/javascript" src="js/jquery-clock-timepicker.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.time').clockTimePicker({});
	});
</script>



</body>
</html>

	
	
