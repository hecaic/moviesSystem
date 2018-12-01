<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>结算界面</title>
</head>
<body>
<form action="pay_film" method="post">
<table style="width: 1000px;">
<tr style="width: 1000px;height: 100px;background-color:#f0f0f0;">
<td style="width: 800px;padding-left: 20px;">
<p><span style="font-size:30px">${queryinfor.getFilmName()}</span></p>
<p>订单编号：<span>${queryinfor.getPtime()}</span></p>
</td><td style=" width: 200px;">
<p><span>原价</span><span style="padding-left: 100px;">${queryinfor.getTicketOffice()}元</span></p>
<p><span>支付金额 </span><span style="padding-left: 65px;color: #fc4984;">${queryinfor.getTicketOffice()}元</span></p>
</td></tr>
<tr style="height: 100px;">
<td style="font-size:20px;padding-left: 20px;">选择支付方式</td>
</tr>
<tr style="height: 5px;background-color:#f0f0f0;" ><td></td><td></td></tr>
<tr>
<td colspan="2"><input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/19.png"/>
<input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/14.png"/>
<input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/21.png"/>
<input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/16.png"/>
</td>
</tr>
<tr>
<td colspan="2"><input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/17.png"/>
<input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/18.png"/>
<input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/13.png" style="width: 160px;"/>
<input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/15.png"/>
</td>
</tr>
<tr>
<td colspan="2">
<input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/11.png"/>
<input name="pay" type="radio" value="1" style="height: 49px;margin-left: 50px;"/><img src="img/12.png"/>
</td>
</tr>
</table>
<input type="submit" name="submit" class="btn" value="立即支付" style="background-color: #057dff; color:#fff;font-size: 25px;margin-left: 800px;"/>
</form>
</body>
</html>