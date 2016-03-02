<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page import="org.apache.shiro.*"%>
<html>
<%  
	String path	= request.getContextPath();
	String basePath	= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	out.print(basePath);
%>
<body>
<shiro:user>已登录</shiro:user><shiro:guest>游客</shiro:guest>
<h2>Login success!</h2>
<h3>您的余额为：${money}</h3>
<a href="<%=basePath%>/web/reduce">取钱</a><br>
<a href="<%=basePath%>/show.jsp">用户权限信息查看</a></br>
<a href="<%=basePath%>/logout">退出</a>
</body>
</html>
