package com.ai.shiro.app;

import java.util.Map;

import org.apache.shiro.authc.AuthenticationToken;

public class AppToken implements AuthenticationToken {

	private String username;
	private Map<String, ?> params;
	private String clientDigest;

	public AppToken(String username, Map<String, ?> params, String clientDigest) {
		this.username = username;
		this.params = params;
		this.clientDigest = clientDigest;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Map<String, ?> getParams() {
		return params;
	}

	public void setParams(Map<String, ?> params) {
		this.params = params;
	}

	public String getClientDigest() {
		return clientDigest;
	}

	public void setClientDigest(String clientDigest) {
		this.clientDigest = clientDigest;
	}

	public Object getPrincipal() {
		return username;
	}

	public Object getCredentials() {
		return clientDigest;
	}
}
