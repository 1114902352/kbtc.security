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
<shiro:hasRole name="adminstration">权限[adminstration]</shiro:hasRole></br>
</body>
</html>
