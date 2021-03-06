package com.ai.shiro.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.AccessControlFilter;

public class AppAuthcFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		return false;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		System.out.println("进入到无状态过滤器中");
		// 1、客户端生成的消息摘要
		String clientDigest = request.getParameter("digest");
		// 2、客户端传入的用户身份
		String username = request.getParameter("username");
		// 3、客户端请求的参数列表
		Map<String, String[]> params = new HashMap<String, String[]>(request.getParameterMap());
		params.remove("digest");

		// 4、生成无状态Token
		AppToken token = new AppToken(username, params, clientDigest);

		try {
			// 5、委托给Realm进行登录
			getSubject(request, response).login(token);
		} catch (Exception e) {
			e.printStackTrace();
			onLoginFail(response); // 6、登录失败
			return false;
		}
		return true;
	}

	// 登录失败时默认返回401状态码
	private void onLoginFail(ServletResponse response) throws IOException {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		httpResponse.getWriter().write("login error");
	}

}
