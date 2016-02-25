package com.ai.springmvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecruityFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("CSRF过滤器启动");
	}

	@Override
	public void destroy() {
		System.out.println("CSRF过滤器销毁");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("CSRF过滤前"+"before");
		String referer = ((HttpServletRequest)request).getHeader("Referer");
		System.out.println("Referer==============="+referer);
//		if(referer==null||!referer.contains(getIP())){
//			PrintWriter out = response.getWriter();
//			out.write("Error 非本站发起请求!");
//			out.flush();
//			out.close();
//			return;
//		}
		((HttpServletResponse)response).setHeader("Set-Cookie", "cookiename=cookievalue;HttpOnly");
		chain.doFilter(request, response);
		System.out.println("CSRF过滤后"+"after");
		
	}

	public String getIP(){
		return "127.0.0.1";
	}
}
