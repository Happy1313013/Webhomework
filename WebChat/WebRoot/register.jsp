<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户注册页面</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 
	<link rel="stylesheet" type="text/css" href="CSS/style.css">
	-->
	
  </head>
  
  <body background="image/back2.jpg">
  <br><br><br><br><br><br>
  <h1 align="center" color="#000099">注册新用户</h1>
  <form action="add" method="post" align="center" name="form1">
	<br><br><br>
  <table>
  	用户名：<input name="username" type="txet" style="width:180px;"/> <br/>
  	<p></p>
  	昵称：&nbsp<input name="id" type="text" style="width:180px;"/><br/>
  	<p></p>
  	密码：&nbsp<input name="password" type="password" style="width:180px"/><br/>
  	<p></p>
  	<br><br>
  	<fnot size="+1">
  	<input type="submit" style="width:80px; height:35px "value="注册"/>
	</fnot>
	</table>
	<br>
  	<font size="+3" color="#000000">
  	<a href="login.jsp">return</a> 
  	</font>
  	
  	</form>
  </body>
</html>
