<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>结算界面</title>
<style type="text/css">
#top{

 width:50%;
    height: 40px;
    line-height:40px;
     display: inline;

 float:left;
 }
#left{
    padding-left: 100px;
width:300px;
    height: 200px;
      
   

float:left;

}
#center{
width:300px;
    height: 200px;

text-align:center;
float:left;
}
#right{
padding-right: 100px;
width:200px;
    height: 250px;
text-align:center;

float:left;

}
#under{
width:900px;
    height: 40px;
    text-align:right;

}
.btn{
    height: 56px;
    width: 166px;
    
}
#top1{
 width:50%;
    height: 40px;
    line-height:40px;
     display: inline;
     text-align:center;
     font-size:7px;

 float:left;
}

</style>
</head>
<body>
<div id="top">确认订单信息</div>
<div id="top1">订单号：${FindByfilmName.getOrderId() }</div>

<!--  <p>电影名：<span>${FindByfilmName.getFilmName()}</span></p>
<p>总价：<span>${FindByfilmName.getTotalPrice()}</span></p>
<p>单价：<span>${FindByfilmName.getPrice()}</span></p>
<p>订单号：<span>${FindByfilmName.getOrderId() }</span></p>
<p>用户：<span>${FindByfilmName.getUserName() }</span></p>
<p>票数：<span>${FindByfilmName.getNumber()}</span></p>
<p>座位：<span>${FindByfilmName.getSeats() }</span></p>
<p>订单时间：<span>${FindByfilmName.getOrderTime() }</span></p>-->

<div id="left" style="padding-top: 35px;">
<p>电影名：<span>${FindByfilmName.getFilmName()}</span></p>
<p>播放影厅：<span>${FindByfilmName.getRoomName()}</span></p>
<p>场次：<span>${FindByfilmName.getStateTime()}</span></p>
<p>座位：<span>${FindByfilmName.getSeats() }</span></p>

</div>

 <div id="center">
<p style="text-align: left;padding-top: 75px;font-size:18px">订单生成时间：</p>
 <p style="text-align: center;font-size:18px">${FindByfilmName.getOrderTime()}</p>
 
 </div>

 <div id="right" >
 <p style=" line-height:200px; text-align:center;font-size:20px">金额小计：<span>￥${FindByfilmName.getTotalPrice()}</span></p>
 
 </div>
 <div id="under">
 <form action="addSum" method="post">
 <input type="hidden" name="filmName" value="${FindByfilmName.getFilmName()}">
 <input type="hidden" name="totalCound" value="${FindByfilmName.getSeats() }">
 <input type="hidden" name="roomName" value="${FindByfilmName.getRoomName()}">
 <input type="hidden" name="ticketOffice" value="${FindByfilmName.getTotalPrice()}">
 <input type="hidden" name="Ptime" value="${FindByfilmName.getStateTime()}">
 <input type="hidden" name="orderid" value="${FindByfilmName.getOrderId()}">
 <table>
 <tr>
 <td style="padding-left: 720px;padding-bottom: 20px;"><span style="font-size:15px;">实际支付：</span><span style="color: #fc4984;font-size:21px;">${FindByfilmName.getTotalPrice()}.00 元</span></td>
 </tr>
 </table>
  <input type="submit" name="submit" class="btn" value="确认并去支付" style="background-color: #fc4984; color:white;font-size:18px"/>
 </form>
 
 </div>
</body>
</html>