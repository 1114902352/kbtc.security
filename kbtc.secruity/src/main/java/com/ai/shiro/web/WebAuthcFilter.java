package com.ai.shiro.web;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.filter.AccessControlFilter;

public class WebAuthcFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest arg0, ServletResponse arg1, Object arg2) throws Exception {
		return false;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		System.out.println("进入到根据登录密码验证过滤器");
//		String referer = ((HttpServletRequest)request).getHeader("Referer");
//		System.out.println("Referer==============="+referer);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		try {
			getSubject(request, response).login(token);
			SecurityUtils.getSubject().getSession().setAttribute("test", "123456");
//			((HttpServletResponse)response).setHeader("Set-Cookie", "cookiename=cookievalue;HttpOnly");
		} catch (Exception e) {
			e.printStackTrace();
			onLoginFail(response);
			return false;
		}
		return true;
	}

	// 登录失败时默认返回401状态码
	private void onLoginFail(ServletResponse response) throws IOException {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.getWriter().write("incorrect username or password");
	}
}
