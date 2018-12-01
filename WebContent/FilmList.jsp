
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
<script type="text/javascript" src="js/Bootstrap/js/bootstrap.min.js"></script>
<title>电影信息</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<script src="../js/jquery-1.8.2.min.js"></script>
<link rel="stylesheet" href="../css/bootstrap.min.css">
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

</head>
<body>
<div style="border: solid 1px; border-color: #DDDDDD">
		<form action="listFilm" method="post" >
			<table style=" height: 125px;
			">
				<tr>
					<td>影片类型：</td>
					<td><select name="filmType" id="filmType" style="height: 27px;width: 172px;">
							<option selected="selected" value="">----请选择----</option>
							<option value="科幻片">科幻片</option>
							<option value="爱情片">爱情片</option>
							<option value="喜剧片">喜剧片</option>
							<option value="恐怖片">恐怖片</option>
							<option value="动作片">动作片</option>
						</select>
					</td>
					<td>&nbsp;影片语言：</td>
					<td><select name="filmLanguage" id="filmLanguage" style="width: 177px;height: 27px;">
							<option selected="selected" value="">----请选择----</option>
							<option value="英语">英语</option>
							<option value="国语">国语</option>
							<option value="其他">其他</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>&nbsp;影片名字：</td>
					<td>
						<input type="text" value="" name="filmName" id="filmName">
					</td>
					<td>
					</td>
					<td>
						<input type="submit" value="查询" class="btn btn-success" style="width: 100px"/>
					</td>
				</tr>
			</table>
		</form>	
	</div>
	<table class="table">
		<tbody id="tbody">

     <c:forEach items="${Filmlist }" var="item"  varStatus="count">
       <c:if test="${count.count%2==1}">
			<tr>
		</c:if>
			
				<td >
					
					<table width="500px" border="0" cellpadding="0" cellspacing="0"
						bordercolor="#FFFFFF" bordercolordark="#D2E3E6"
						bordercolorlight="#FFFFFF">
					
							<tr>
								<td width="200px" height="270px" rowspan="11"><img
									src="filmimg/${item.getFilmImg()}"
									style="width: 200px; height: 250px;"><br>
									<a href="FindBuyFilmId?filmId=${item.getFilmId()}" 
									  ><button style="width: 196px;height: 31px;background-color:#008800; color:white" >预定</button></a>
									  </td>
							</tr>
							<tr>
								<td style="height: 20px; width: 300px;"><div
										style="height: 20px; width: 300px;">电影名： ${item.getFilmName()}</div></td>
							</tr>
							<tr>
								<td style="height: 20px; width: 300px;"><div
										style="height: 20px; width: 300px;">电影类型 ：${item.getFilmType() }</div></td>
							</tr>
							<tr>
								<td style="height: 20px; width: 300px;"><div
										style="height: 20px; width: 300px;">播放类型 ：${item.getPlayType() }</div></td>
							</tr>
							<tr>
								<td style="height: 20px; width: 300px;"><div
										style="height: 20px; width: 300px;">电影时长： ${item.getFilmLong() }分钟</div></td>
							</tr>
							<tr>
								<td style="height: 20px; width: 300px;"><div
										style="height: 20px; width: 300px;">播放影厅： ${item.getAddress() }</div></td>
							</tr>
							<tr>
								<td style="height: 20px; width: 300px;"><div
										style="height: 20px; width: 300px;">导演： ${item.getDirector() }</div></td>
							</tr>
							<tr>
								<td style="height: 40px; width: 300px;"><div
										style="height: 40px; width: 300px;">主演： ${item.getActor() }</div></td>
							</tr>
							<tr>
								<td style="height: 20px; width: 300px;"><div
										style="height: 20px; width: 300px;">语言： ${item.getFilmLanguage() }</div></td>
							</tr>
							<tr>
								<td style="height: 100px; width: 300px;"><div
										style="height: 100px; width: 300px;">简介： ${item.getJianJie() }</div></td>
							</tr>

						
					</table>
					
				</td>
				<c:if test="${count.count%2==0}">
			</tr>
			</c:if>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>