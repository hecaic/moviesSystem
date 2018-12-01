<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="js/Bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<script type="text/javascript" src="js/Bootstrap/js/bootstrap.min.js"></script>
</head>

<script type="text/javascript">
	$(function(){
		$("#test1").click(function(){
			
			var filmName=$("#filmName").val();
			var filmImg=$("#filmImg").val();
			var address=$('#address option:selected').val();
			var director=$("#director").val();
			var filmLong=$("#filmLong").val();
			var actor=$("#actor").val();
			var price=$("#price").val();
			if(filmName==""||filmName==null){
				alert("电影名不能为空");return false;
			}
			if(filmImg==""||filmImg==null){
				alert("图片不能为空");return false;
			}
			if(address=="--请选择--"||address==null){
				alert("播放影厅不能为空");return false;
			}
			if(director==""||director==null){
				alert("导演不能为空");return false;
			}
			if(filmLong==""||filmLong==null){
				alert("电影时长不能为空");return false;
			}
			if(actor==""||actor==null){
				alert("请加入该影片的主演姓名");return false;
			}
			if(price==""||price==null){
				alert("价格不能为空");return false;
			}
			
		});
	});
</script>
<body>

	<table width="778" border="0" align="center" cellspacing="0"
		cellpadding="0">
		<tr>
			<td width="176" align="center" valign="top" bgcolor="#FFFFFF"></td>
			<td width="602" valign="top" bgcolor="#FFFFFF"><table
					width="99%" height="487" border="0" cellpadding="0" cellspacing="0"
					align="right">
					<tr>
						<td height="30"  class="tableBorder_thin"></td>
					</tr>
					<tr>
						<td align="center" valign="top">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="84%">&nbsp;</td>
								</tr>
							</table>
							<form action="Filmadd" method="post" enctype="multipart/form-data">
								<table width="85%" border="0" cellpadding="0" cellspacing="0"
									bordercolor="#FFFFFF" bordercolordark="#D2E3E6"
									bordercolorlight="#FFFFFF">
								<tr>
										<td width="200px" height="200px" rowspan="12"><img
											src="filmimg/f11.jpg" id="showImage"
											style="width: 200px; height: 300px;"><br> <input
											type="hidden" name="getImage" id="getImage"> <input
											type="file" width="150px" name="file" id="filmImg"
											onchange="change()"></td>
										<td>
									</tr>
									<tr>
										<td>电影名：</td>
										<td><input type="text" name="filmName" id="filmName"></td>
									</tr>
									<tr>
										<td>影片类型：</td>
										<td><select name="filmType" id="filmType" style="height: 28px;">
												<option selected="selected">科幻片</option>
												<option>爱情片</option>
												<option>喜剧片</option>
												<option>恐怖片</option>
												<option>动作片</option>
										</select></td>
									</tr>
									<tr>
										<td>播放类型：</td>
										<td><select name="playType" id="playType" style="height: 28px;">
												<option selected="selected">2D</option>
												<option>3D</option>
										</select></td>
									</tr>
									
									<tr>
										<td>片长：</td>
										<td><input type="text" name="filmLong" id="filmLong"></td>
									</tr>
									<tr>
										<td>单价：</td>
										<td><input type="text" name="price" id="price"></td>
									</tr>
									<tr>
										<td>导演：</td>
										<td><input type="text" name="director" id="director"></td>
									</tr>
									<tr>
										<td>主演：</td>
										<td><input type="text" name="actor" id="actor"></td>
									</tr>
									<tr>
										<td>语言：</td>
										<td><select name="filmLanguage" id="filmLanguage" style="height: 28px;">
												<option selected="selected">英语</option>
												<option>国语</option>
												<option>其他</option>
										</select></td>
									</tr>
									<tr>
										<td>状态：</td>
										<td><select name="filmState" id="filmState" style="height: 28px;" >
												<option selected="selected" >正在上映</option>
												<option >即将上映</option>
										</select></td>
									</tr>
									<tr>
										<td>影厅：</td>
										<td><select name="address" id="address" style="height: 28px;">
												<option selected="selected" >--请选择--</option>
												<c:forEach items="${listroomname }" var="item">
												<option value="${item.getRoomName()}">${item.getRoomName()}</option>
												</c:forEach>
										</select></td>

									</tr>
									<tr>
										<td>简介：</td>
										<td><input type="text" name="jianJie" id="jianJie"></td>
									</tr>
									<tr>
										 <td height="65" align="left" style="padding: 5px;">&nbsp;</td>
										<td colspan="2"><input type="submit" name="submit" id="test1"
											styleClass="btn_grey" value="保存" /> &nbsp; <input
											type="reset" name="reset" styleClass="btn_grey" value="取消" />
										</td>
									</tr>
								</table>
							</form>
						</td>
					</tr>
				</table></td>
		</tr>
	</table>

</body>
</html>
