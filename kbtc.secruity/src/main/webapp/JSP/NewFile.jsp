<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%  
	String path	= request.getContextPath();
	String basePath	= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	out.print(basePath);
%>
</head>
<body>
<form action="<%=basePath%>/TestAction/temp/webTest" method="post">
	<input type="text" value="zhangqing" name="username"/>
	<input type="text" value="zq1992925" name="password"/>
	<input type="submit" value="自定义登录"/>
</form>
<form action="<%=basePath%>/TestAction/Web/shiroLogin" method="post">
	<input type="text" value="zhangqing" name="username"/>
	<input type="text" value="zq1992925" name="password"/>
	<input type="submit" value="Shiro登录"/>
</form>
</body>
</html>