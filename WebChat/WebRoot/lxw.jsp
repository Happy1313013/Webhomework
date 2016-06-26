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

<title>刘晓伟的主页</title>
<style type="text/css">
	body  {margin-left:55% }
</style>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
  $("#hide").click(function(){
  $("p").hide();
  });
  $("#show").click(function(){
  $("p").show();
  });
});
</script>
	<h1 align="left">欢迎来到刘晓伟的主页</h1>
</head>

<body>
	<a href="index.html">编辑个人信息</a>
	<a href="Linfo.jsp">查看个人信息</a>
</body>
<body background="image/02.gif">
	<h1>选择好友并进行聊天</h1>
	<br>
	<form>
		<h2>好友列表</h2>
		<p>
			<a href="lw.html"><img src="image/wyh.PNG" width=25 heigth=25>wyh</a>
		</p>
		<p>
			<a href="ls.html"><img src="image/sl.PNG" width=25 heigth=25>sl</a>
		</p>
	</form>
	<button id="hide" type="button">隐藏好友列表</button>
	<button id="show" type="button">显示好友列表</button>
</body>


</html>
