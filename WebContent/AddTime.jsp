<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>日期选择</title>
    <link rel="stylesheet" href="css/calendar.css">
 
</head>
<body>

<form action="TimeAdd" method="post">


<div style="font-size: 30px;padding-top: 100px;text-align:left;width: 742px;padding-left: 250px;" >添加场次</div>

<div style="height: 10px;"></div>

<label  for="filmName" style="font-size:20px;padding-left: 260px;">电影名：</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select name="filmName" class="datepicker" id="filmName" style="height: 42px;width: 340px;">
<option selected="selected" >--请选择--</option>
  <c:forEach items="${listFilmname }" var="item">
  <option value="${item.getFilmName()}">${item.getFilmName()}</option>
  </c:forEach>
	</select>
	<div style="height: 10px;"></div>
	<!--  <label for="datepicker" style="font-size:20px;">场次时间</label>	-->
	<table>
	<tr>
	<td style="font-size:20px;width: 200px"></td>
	<td style="font-size:20px;width: 200px;text-align:center;">场次选择:</td>
    <td><div class="datepicker" id="calendar">
        <input type="text" name="time" id="mytime">
        <i class="fa fa-calendar"></i>
    </div></td>
    </tr>
    </table>
    <div style="height: 10px;"></div>
   <!--   <input type="text" name="nowtime" id="nowtime" value="noetime"/>-->
     <input type="submit" name="submit" id="itime" value="确定" style="margin-left: 450px;width: 150px;height: 50px;background-color:#008800; color:white" />
     
    </form>
    <script src="js/jquery-1.12.4.min.js"></script>
    <script src="js/calendar.js?v=<%=Math.random()%>"></script>
    <script>
        $(function () {
            $('#calendar').calendar()
        })
    </script>
</body>

</html>