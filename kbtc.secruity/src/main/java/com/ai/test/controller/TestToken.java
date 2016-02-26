package com.ai.test.controller;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ai.shiro.common.HmacSHA256Utils;

public class TestToken {

	private RestTemplate restTemplate = new RestTemplate();
	
//	@Test
    public void testServiceHelloSuccess() {
        String username = "admin";
        String param11 = "param11";
        String param12 = "param12";
        String param2 = "param2";
        String key = "dadadswdewq2ewdwqdwadsadasd"+"error";
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("username", username);
        params.add("param1", param11);
        params.add("param1", param12);
        params.add("param2", param2);
        String digest = HmacSHA256Utils.digest(key, params);
        params.add("digest", digest);
        System.out.println("测试程序摘要串:"+digest);
        String url = UriComponentsBuilder
                .fromHttpUrl("http://127.0.0.1:8080/TestAction/Service/temp/AppTest")
                .queryParams(params).build().toUriString();
        ResponseEntity responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(responseEntity.getBody());
//        Assert.assertEquals("hello" + param11 + param12 + param2, responseEntity.getBody());
    }
	
	@Test
	public void testWeb(){
		String username = "zhangqing";
		String password = "zq1992925";
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("username", username);
		params.add("password", password);
		String url = UriComponentsBuilder
                .fromHttpUrl("http://127.0.0.1:8080/TestAction/Web/temp/webTest")
                .queryParams(params).build().toUriString();
		ResponseEntity responseEntity = restTemplate.getForEntity(url, String.class);
		System.out.println(responseEntity.getBody());
	}
}
