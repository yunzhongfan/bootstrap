<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页面</title>
<style type="text/css">
#main-nav {
	margin-left: 1px;
}

#main-nav.nav-tabs.nav-stacked>li>a {
	padding: 10px 8px;
	font-size: 12px;
	font-weight: 600;
	color: #4A515B;
	background: #E9E9E9;
	background: -moz-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #FAFAFA),
		color-stop(100%, #E9E9E9));
	background: -webkit-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	background: -o-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	background: -ms-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	background: linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FAFAFA',
		endColorstr='#E9E9E9');
	-ms-filter:
		"progid:DXImageTransform.Microsoft.gradient(startColorstr='#FAFAFA', endColorstr='#E9E9E9')";
	border: 1px solid #D5D5D5;
	border-radius: 4px;
}

#main-nav.nav-tabs.nav-stacked>li>a>span {
	color: #4A515B;
}

#main-nav.nav-tabs.nav-stacked>li.active>a, #main-nav.nav-tabs.nav-stacked>li>a:hover
	{
	color: #FFF;
	background: #3C4049;
	background: -moz-linear-gradient(top, #4A515B 0%, #3C4049 100%);
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #4A515B),
		color-stop(100%, #3C4049));
	background: -webkit-linear-gradient(top, #4A515B 0%, #3C4049 100%);
	background: -o-linear-gradient(top, #4A515B 0%, #3C4049 100%);
	background: -ms-linear-gradient(top, #4A515B 0%, #3C4049 100%);
	background: linear-gradient(top, #4A515B 0%, #3C4049 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#4A515B',
		endColorstr='#3C4049');
	-ms-filter:
		"progid:DXImageTransform.Microsoft.gradient(startColorstr='#4A515B', endColorstr='#3C4049')";
	border-color: #2B2E33;
}

#main-nav.nav-tabs.nav-stacked>li.active>a, #main-nav.nav-tabs.nav-stacked>li>a:hover>span
	{
	color: #FFF;
}

#main-nav.nav-tabs.nav-stacked>li {
	margin-bottom: 4px;
}
/*定义二级菜单样式*/
.secondmenu a {
	font-size: 10px;
	color: #4A515B;
	text-align: center;
}

.navbar-static-top {
	background-color: #212121;
	margin-bottom: 5px;
}

.navbar-brand {
	background: url('') no-repeat 10px 8px;
	display: inline-block;
	vertical-align: middle;
	padding-left: 50px;
	color: #fff;
}
</style>
</head>

<div class="aside-wrap ng-scope" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<ul id="main-nav" class="nav nav-pills nav-stacked">
				<li class="active">
				<a href="#"> <i class="glyphicon glyphicon-th-large"></i> 首页</a>
				</li>
				<li><a href="#systemSetting" class="nav-header collapsed"
					data-toggle="collapse"> <i class="glyphicon glyphicon-cog"></i>
						系统管理 <span class="pull-right glyphicon glyphicon-chevron-down"></span>
				    </a>
					<ul id="systemSetting" class="nav nav-list collapse secondmenu"
						style="height: 0px;">
						<li><a href="#"><i class="glyphicon glyphicon-user"></i>菜单管理</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-user"></i>角色管理</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>角色权限</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>机构人员维护</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-edit"></i>机构管理</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-eye-open"></i>密码管理</a></li>
					</ul>
				</li>
				<li>
				    <a href="#citiaoManager"> <i class="glyphicon glyphicon-credit-card"></i>词条管理</a>
				    <ul id="citiaoManager" class="nav nav-list collapse secondmenu"
                        style="height: 0px;">
	                        <li><a href="#"><i class="glyphicon glyphicon-user"></i>查询词条</a></li>
	                        <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>编辑词条</a></li>
	                        <li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>机构人员维护</a></li>
	                        <li><a href="#"><i class="glyphicon glyphicon-edit"></i>评分机制</a></li>
	                        <li><a href="#"><i class="glyphicon glyphicon-eye-open"></i>审核词条</a></li>
                    </ul>
				</li>
				 <li>
				    <a href="#"> <i class="glyphicon glyphicon-globe"></i> 关键词管理 <span class="label label-warning pull-right">5</span>
					</a>
				</li>
				<li>
				        <a href="./charts.html"> <i class="glyphicon glyphicon-calendar"></i> 异常处理
				        </a>
				</li>
				<li>
						<a href="#">  <i class="glyphicon glyphicon-fire"></i>关于系统
						</a>
				</li>
				<li>
                        <a href="#">  <i class="glyphicon glyphicon-fire"></i>个人中心
                        </a>
                </li>
                <li>
                        <a href="#">  <i class="glyphicon glyphicon-fire"></i>安全退出
                        </a>
                </li>
			</ul>
		</div>
	</div>
</div>

</html>
