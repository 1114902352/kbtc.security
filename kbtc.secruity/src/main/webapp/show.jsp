<%@page import="javax.security.auth.Subject"%>
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
<h3>shiro登录状态:<shiro:user>已登录</shiro:user><shiro:guest>游客</shiro:guest></h3>
<h3>shiro登录登录信息:[<shiro:principal/>]用户</br>
	1:<shiro:hasRole name="adminstration">权限[adminstration]</shiro:hasRole></br>
	2:<shiro:hasPermission name="view">资源[view]</shiro:hasPermission></br>
	3:<shiro:hasPermission name="update">资源[update]</shiro:hasPermission></br>
	<%=SecurityUtils.getSubject().getSession().getAttribute("test") %>
	<a href="<%=basePath%>/test.jsp">跳转</a>
</h3>
</body>
</html>
