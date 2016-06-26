<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>个人信息</title>
<link rel="stylesheet" type="text/css" href="CSS/c.css">

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body>
	<h1>
		<center>您的个人信息：</center>
	</h1>
	<br>
	<br>
	<br>
	<p>
	<center>
		<table>
			<tr>
				<td>昵称：</td>
				<td>小胖</td>
			</tr>
			<tr>
				<td>头像：</td>
				<td><img src="image/wyh.PNG"></td>
			</tr>
			<tr>
				<td>邮箱：</td>
				<td>987654321@qq.com</td>
			</tr>
		</table>
	</center>
	</p>
</body>
</html>
