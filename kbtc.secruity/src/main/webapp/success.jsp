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
<h2>Hello World!</h2>
<h1><%=session.getAttribute("name") %></h1>
<h2>余额为:${money}</h2>
<h3>shiro登录状态:<shiro:user>已登录</shiro:user><shiro:guest>游客</shiro:guest></h3>
<form action="<%=basePath%>/TestAction/temp/reduce">
	<input type="submit" value="取钱"/>
</form>
<h3>shiro session:<%=SecurityUtils.getSubject().getSession().getAttribute("TestSession")%></h3>
<a href="<%=basePath%>/logout">退出</a>
<a href="<%=basePath%>/show.jsp">跳转</a>
</body>
</html>
