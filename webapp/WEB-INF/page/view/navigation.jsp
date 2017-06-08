<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="../common/taglibs.jsp"%>
<%@ include file="../common/comm.jsp"%>
<title>主页面</title>
<head>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resources/css/public.css" />
<!-- 动态菜单CSS -->
<link rel="stylesheet" type="text/css"
	href="${ctx}/resources/css/menu.css" />
<!-- jquery引入 -->
<script src="${ctx}/resources/js/jquery/jquery-2.0.3.min.js"></script>
<!-- 动态菜单JS -->
<script type="text/javascript" src="${ctx}/resources/js/pages/menu.js"></script>
<script type="text/javascript">
		function stops(){
		   return false;
		}
</script>

</head>


<div class="middle">
	<div class="leftMenu">
		<div class="topMenu">
			<img class="banshi" src="${ctx}/resources/image/banshidating.png">
			<p class="menuTitle">词条管理系统</p>
			<img class="changeMenu" src="${ctx}/resources/image/banshidating.png"
				onclick="hidMenu()">
		</div>
		<div class="menu_list">
			<ul>
				<li class="">
					<p class="fuMenu">系统设置</p> <img class="xiala"
					src="${ctx}/resources/image/xiala.png">
					<div class="div1">
						<p class="zcd" id="zcd1">菜单管理</p>
						<p class="zcd" id="zcd2">角色权限管理</p>
						<p class="zcd" id="zcd3">权限管理</p>
						<p class="zcd" id="zcd4">机构人员维护</p>
						<p class="zcd" id="zcd4">机构管理</p>

					</div>
				</li>
				<li class="">
					<p class="fuMenu">词条管理</p> <img class="xiala"
					src="${ctx}/resources/image/xiala.png">
					<div class="div1">
						<p class="zcd" id="zcd9">查询词条</p>
						<p class="zcd" id="zcd10">编辑词条</p>
						<p class="zcd" id="zcd11">评分机制</p>
						<p class="zcd" id="zcd12">青审核词条</p>
					</div>
				</li>
				<li class="">
					<p class="fuMenu">关键词管理</p> <img class="xiala"
					src="${ctx}/resources/image/xiala.png">
					<div class="div1">
						<p class="zcd" id="zcd19">北京烤鸭</p>
						<p class="zcd" id="zcd20">驴打滚</p>
						<p class="zcd" id="zcd19">冰糖葫芦</p>
						<p class="zcd" id="zcd20">灌肠</p>
						<p class="zcd" id="zcd19">豌豆黄</p>
						<p class="zcd" id="zcd20">羊眼包子</p>
					</div>
				</li>
			</ul>
		</div>
	</div>
</div>

</html>


