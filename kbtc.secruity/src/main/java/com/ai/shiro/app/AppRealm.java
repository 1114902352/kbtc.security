package com.ai.shiro.app;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.ai.shiro.common.HmacSHA256Utils;

public class AppRealm extends AuthorizingRealm {

	@Override
	public boolean supports(AuthenticationToken token) {
		// 仅支持StatelessToken类型的Token
		return token instanceof AppToken;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 根据用户名查找角色，请根据需求实现
		String username = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		AppToken statelessToken = (AppToken) token;
		String username = statelessToken.getUsername();
		// 根据用户名获取密钥（和客户端的一样）
		String key = getKey(username);
		// 在服务器端生成客户端参数消息摘要
		String serverDigest = HmacSHA256Utils.digest(key, statelessToken.getParams());
		System.out.println("客户端摘要串:"+statelessToken.getClientDigest());
		System.out.println("服务端摘要串:"+serverDigest);
		// 然后进行客户端消息摘要和服务器端消息摘要的匹配
		System.out.println("APP 登录成功==============================");
		return new SimpleAuthenticationInfo(username, serverDigest, getName());
	}

	private String getKey(String username) {// 得到密钥，此处硬编码一个
		if ("admin".equals(username)) {
			return "dadadswdewq2ewdwqdwadsadasd";
		}
		return null;
	}
}
