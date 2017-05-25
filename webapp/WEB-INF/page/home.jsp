<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/page/common/taglibs.jsp" %>
<%@ include file="/page/common/comm.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页面</title>
<%@ include file="/page/header.jsp" %>
</head>
<body>
 <div class=".container-fluid">
        <div class="row">
        <div class="col-md-3 text-right">
                     <jsp:include page="/page/sidebar.jsp"></jsp:include>
         </div>
	     <div class="col-md-9">
	       <jsp:include page="/page/navigation.jsp"></jsp:include> 
	      <jsp:include page="/page/context.jsp"></jsp:include> 
	     </div>
     
       
        </div>
</div>


</body>
</html>