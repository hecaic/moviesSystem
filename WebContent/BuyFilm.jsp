<!--用户查看电影信息页面 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<link rel="stylesheet" href="js/Bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">
	<link rel="stylesheet" type="text/css" href="css/build.css">
<script type="text/javascript" src="js/Bootstrap/js/bootstrap.min.js"></script>
<title>电影信息</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<style type="text/css">
table {
	max-width: 100%;
	background-color: transparent;
	border-collapse: collapse;
	border-spacing: 0
}

.table {
	width: 100%;
	margin-bottom: 20px;
	margin: auto
}

.table th, .table td {
	padding: 2px;
	height: 300px;
	width: 50%;
	text-align: left;
	vertical-align: top;
}

.table th {
	font-weight: bold
}

.table thead th {
	vertical-align: bottom
}

.table-bordered {
	border-collapse: separate;
	*border-collapse: collapse;
	border-left: 0;
	-webkit-border-radius: 4px;
	-moz-border-radius: 4px;
	border-radius: 4px
}

.table .table {
	background-color: #fff
}

.td_color {
	background-color: #f0ad4e;
}

.movie_td {
	height: 20px;
}

</style>
<script type="text/javascript">
	$(function(){
		$("#palytime").click(function(){
			
			var name=$('#Ptime option:selected').val();
			
			if(name==null||name==""){
				alert("场次不能为空，请选择场次");return false;
			}
			
		});
	});
</script>

</head>
<body>
<form action="queryFilmId" method="post">
<input type="hidden" name="filmName" value="${FindBuyFilmId.getFilmName()}">
	<table class="table">
		<tbody id="tbody">

     
			<tr>
		
				<td id="d_">
					
					<table width="500px" border="0" cellpadding="0" cellspacing="0"
						bordercolor="#FFFFFF" bordercolordark="#D2E3E6"
						bordercolorlight="#FFFFFF"  >
					
							<tr>
								<td width="200px" height="270px" rowspan="9"><img
									src="filmimg/${FindBuyFilmId.getFilmImg()}"
									style="width: 200px; height: 250px;"><br>
									
									  </td>
							</tr>
							<tr>
								<td style="height: 30px; width: 200px;padding-left: 100px;"><div
										style="height: 30px; width: 200px;">电影名： ${FindBuyFilmId.getFilmName()}</div></td>
										<td style="height: 30px; width: 200px;padding-left: 100px;"><div
										style="height: 30px; width: 200px;">电影类型 ：${FindBuyFilmId.getFilmType() }</div></td>
							</tr>
							
							<tr>
								<td style="height: 30px; width: 200px;padding-left: 100px;"><div
										style="height: 30px; width: 200px;">播放类型 ：${FindBuyFilmId.getPlayType() }</div></td>
										<td style="height: 30px; width: 200px;padding-left: 100px;"><div
										style="height: 30px; width: 200px;">电影时长： ${FindBuyFilmId.getFilmLong() }分钟</div></td>
							</tr>
							
							
							<tr>
								<td style="height: 30px; width: 200px;padding-left: 100px;"><div
										style="height: 30px; width: 200px;">播放影厅： ${FindBuyFilmId.getAddress() }</div></td>
										<td style="height: 30px; width: 200px;padding-left: 100px;"><div
										style="height: 30px; width: 200px;">导演： ${FindBuyFilmId.getDirector() }</div></td>
							</tr>
							
							<tr>
								<td style="height: 30px; width: 200px;padding-left: 100px;"><div
										style="height: 30px; width: 200px;">主演： ${FindBuyFilmId.getActor() }</div></td>
										<td style="height: 30px; width: 200px;padding-left: 100px;"><div
										style="height: 30px; width: 200px;">语言： ${FindBuyFilmId.getFilmLanguage() }</div></td>
							</tr>
						
							
							<tr>
								<td style="height: 100px; width: 200px;padding-left: 100px;"colspan="2">简介： ${FindBuyFilmId.getJianJie() }</div></td>
							</tr>
							<tr><td style="height: 30px; width: 200px;"><div
										style="height: 30px; width: 200px;font-size:20px">请选择播放场次：</div></td>
							
							</tr>
							<%java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(    
								     "yyyy-MM-d HH:mm:ss");    
							   java.util.Date currentTime = new java.util.Date();    
							   String nowtime = simpleDateFormat.format(currentTime).toString();
							   
							   %>
							 
							<tr>
							<table>
							<tr style="text-align=center;">
							<td style="height: 50px; width: 200px;"></td>
							
								<td  style="height: 50px; width: 600px;"><div  "
										style="height: 50px; width: 600px;font-size:18px">选择日期：<select name="Ptime" id="Ptime" style=" width: 182px;height: 32px;">
												<option selected="selected" value="">--------请选择--------</option>
												<c:forEach items="${list }" var="item">
												<option value="${item}">${item}</option>
												</c:forEach>
										</select>
										 选择时间点：<select name="ttime" id="ttime" style=" width: 182px;height: 32px;">
										<option selected="selected">--------请选择--------</option>
										</select>
										</div></td>
										
							</tr></table></tr>
							
						<tr><td style="width: 216px; height: 46px;padding-left: 400px;" colspan="2" align="center"><div 
						style="width: 216px; height: 46px;">
						<input type="submit" name="submit" id="palytime" value="预选座位" style=" width: 216px; height: 46px;background-color:#008800; color:white"/></div></td>
						</tr>
                       	
						
					</table>
					 
		                    
		                    
				</td>
				
			</tr>
		</tbody>
	</table>
	 
</form>
<script type="text/javascript" src="js/buyFilm.js"></script>
</body>
</html>