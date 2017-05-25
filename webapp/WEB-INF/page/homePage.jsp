<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<%@ include file="/page/common/comm.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页面</title>
</head>
<body>
	<div class=".container-fluid" >
		<div class="row" >
			<div class="col-md-12 text-right" style="background-color: #2c3e50;">
				<jsp:include page="view/sidebar.jsp"></jsp:include>
			</div>
		</div>
		<div  class="row-fluid">
				<div class="col-md-2 offset1" style="background-color: #f5f5f5;height:100%" >
					<jsp:include page="view/navigation.jsp"></jsp:include>
				</div>
				<div class="col-md-8">
					<jsp:include page="view/context.jsp"></jsp:include>
				</div>
		</div>
		</div>
	</div>

</body>
</html>