<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body background="image/3.jpg">
  <form name="form1" id="form1" action="addm" align="center"  method="post">
   <h1> Welcome to Our Web Chat</h1> <br>
   <h2 align="center">用户登录界面</h2>
   <table>
   	用户：<input type="text" name="username" style="width: 193px; "/><br/>
   	密码：<input type="password" name="pwd"style="width: 193px; "/><br/>
   	<p><font size="+1">
   <input type="submit" name="submit" class="button" style="width:100px;height:35px" value="登录"/><br/>
	</td>
	</font></p></table>
	<p><font size="+2">
	<a href="register.jsp">用户注册</a><br/> 	
	</font></p>
   </form>
  </body>
</html>
