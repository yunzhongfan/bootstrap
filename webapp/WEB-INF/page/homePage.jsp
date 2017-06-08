<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="./common/taglibs.jsp"%>
<%@ include file="./common/comm.jsp"%>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页面</title>
<script type="text/javascript">
	$(function() {
		$("#sidebar").load("${ctx}/securityMainframe/userBasicInfoPage");
		$("#navigation").load("${ctx}/securityMainframe/orderPage");
		$("#context").load("${ctx}/securityMainframe/contextPage");
	});
</script>
</head>
<body>
	<div class=".container-fluid">
		<div class="row">
			<div class="col-md-12 text-right" style="background-color: #2c3e50;">
				<div id="sidebar"></div>
			</div>
		</div>
		<div class="row-fluid">
			<div class="col-md-2 "style="background-color: #f5f5f5; paddind-right:0px;">
				<div id="navigation"></div>
			</div>
			<div class="col-md-10">
				<div id="p" class="panel panel-default">
					<div id="context"  class="panel-body"></div>
				</div>
			</div>
		</div>
	</div>
	</div>

</body>
</html>