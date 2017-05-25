<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<ol class="breadcrumb">
    <li><a href="#">Home</a></li>
    <li><a href="#">2013</a></li>
    <li class="active">十一月</li>
</ol>

<table class="table table-striped">
	<thead>
		<tr>
			<td>THEAD 中的文本</td>
		</tr>
	</thead>
	<tfoot>
		<tr>
			<td>TFOOT 中的文本</td>
		</tr>
	</tfoot>
	<tbody>
	<%for (int i = 0;i<5;i++){
		%>
		<tr>
			<td>TBODY 中的文本</td>
		</tr>
	<%
	}
	%>
		
	</tbody>





</table>




