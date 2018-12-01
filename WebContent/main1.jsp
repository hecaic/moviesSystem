<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head id="Head1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>欢迎使用电影院售票系统</title>
    <link href="Css/default.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="js/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="js/themes/icon.css" />
    <script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.1.2.2.js"></script>
	<script type="text/javascript" src='js/outlook2.js'> </script>
    <script type="text/javascript">
	 var _menus = {"menus":[
						{"menuid":"1","icon":"icon-sys","menuname":"基本信息",
							"menus":[
                                    {"menuid":"12","menuname":"管理员信息","icon":"icon-users","url":"demo2.jsp"},
									{"menuid":"13","menuname":"用户信息","icon":"icon-users","url":"list"},
									
								]
						},{"menuid":"8","icon":"icon-sys","menuname":"影片信息",
							"menus":[{"menuid":"21","menuname":"影片管理","icon":"icon-nav","url":"Movielist"},
							         {"menuid":"22","menuname":"添加影片","icon":"icon-users","url":"listroomname"},
							         {"menuid":"23","menuname":"影厅管理","icon":"icon-users","url":"Roomlist"},
							         {"menuid":"24","menuname":"场次管理","icon":"icon-users","url":"listTimeAll"},
								
								]
						},{"menuid":"56","icon":"icon-sys","menuname":"票务信息",
							"menus":[{"menuid":"31","menuname":"订单管理","icon":"icon-nav","url":"Orderlist"},
							         {"menuid":"32","menuname":"综合统计","icon":"icon-users","url":"Statistics"},
								]
						}
				]};
	//设置登录窗口
		function openPwd() {
			$('#w').window({
				title : '修改密码',
				width : 300,
				modal : true,
				shadow : true,
				closed : true,
				height : 160,
				resizable : false
			});
		}
		//关闭登录窗口
		function closePwd() {
			$('#w').window('close');
		}

		//修改密码
		function serverLogin() {
			var $newpass = $('#txtNewPass');
			var $rePass = $('#txtRePass');

			if ($newpass.val() == '') {
				msgShow('系统提示', '请输入密码！', 'warning');
				return false;
			}
			if ($rePass.val() == '') {
				msgShow('系统提示', '请在一次输入密码！', 'warning');
				return false;
			}

			if ($newpass.val() != $rePass.val()) {
				msgShow('系统提示', '两次密码不一至！请重新输入', 'warning');
				return false;
			}

			$.post('/ajax/editpassword.ashx?newpass=' + $newpass.val(), function(
					msg) {
				msgShow('系统提示', '恭喜，密码修改成功！<br>您的新密码为：' + msg, 'info');
				$newpass.val('');
				$rePass.val('');
				close();
			})

		}
        //关闭登录窗口
        function closePwd() {
            $('#w').window('close');
        }

        

        

        $(function() {

            openPwd();

            $('#editpass').click(function() {
                $('#w').window('open');
            });

            $('#btnEp').click(function() {
                serverLogin();
            })

			$('#btnCancel').click(function(){closePwd();})

            $('#loginOut').click(function() {
                $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {

                    if (r) {
                        location.href = 'out.jsp';
                    }
                });
            })
        });
		
		

    </script>

</head>
<body class="easyui-layout" style="overflow-y: hidden"  scroll="no">
<noscript>
<div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
    <img src="img/noscript.gif" alt='抱歉，请开启脚本支持！' />
</div></noscript>
    <div region="north" split="true" border="false" style="overflow: hidden; height: 30px;
        background: url(img/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%;
        line-height: 20px;color: #fff; font-family: Verdana, 微软雅黑,黑体">
        <span style="float:right; padding-right:20px;font-size: 16px;"
        class="head">欢迎  <a href="#" id="loginOut">安全退出</a></span>
        <span style="padding-left:10px; font-size: 16px; "><img src="img/blocks.gif" width="20" height="20" align="absmiddle" /> 欢迎使用电影院售票系统</span>
    </div>
    <div region="south" split="true" style="height: 30px; background: #D2E0F2; ">
      
    </div>
    <div region="west" hide="true" split="true" title="管理导航" style="width:200px;" id="west">
<div id="nav" class="easyui-accordion" fit="true" border="false">
		<!--  导航内容 -->
				
			</div>

    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
			<div title="欢迎使用" style="padding:20px;overflow:hidden; color:red; " >
				<h1 style="font-size:24px;">* 作者：14级计科一班何才才</h1>

				
			</div>
		</div>
    </div>
    
    
   

	<div id="mm" class="easyui-menu" style="width:150px;">
		<div id="mm-tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">退出</div>
	</div>


</body>
</html>