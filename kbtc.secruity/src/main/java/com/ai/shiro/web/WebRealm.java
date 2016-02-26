package com.ai.shiro.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

public class WebRealm extends AuthorizingRealm{

	@Override
	public boolean supports(AuthenticationToken token) {
		// 仅支持账号密码类型的Token
		return token instanceof UsernamePasswordToken;
	}
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//授权
		String username = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.addRole("admins");
//		session.setAttribute(arg0, arg1);
		System.out.println("shiro已授权");
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//登录
		UsernamePasswordToken upToken = (UsernamePasswordToken)token;
		String username = upToken.getUsername();
		String password = new String(upToken.getPassword());
		System.out.println("登录者的用户名为"+username);
		System.out.println("登录者的密    码为"+password);
		if(("zhangqing").equals(username)&&("zq1992925").equals(password)){
			Subject subject = SecurityUtils.getSubject();
			Session session = subject.getSession();
			session.setAttribute("TestSession", "我是shiro session中的参数");
			return new SimpleAuthenticationInfo(username, password, "张青");
		}else{
			return null;
		}
	}

}
