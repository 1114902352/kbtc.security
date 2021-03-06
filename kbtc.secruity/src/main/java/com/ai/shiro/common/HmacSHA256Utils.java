package com.ai.shiro.common;

import java.util.List;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.shiro.codec.Hex;


public class HmacSHA256Utils {

	public static String digest(String key, String content) {
		try {
			Mac mac = Mac.getInstance("HmacSHA256");
			byte[] secretByte = key.getBytes("utf-8");
			byte[] dataBytes = content.getBytes("utf-8");
			
			SecretKey secret = new SecretKeySpec(secretByte, "HMACSHA256");
			mac.init(secret);

			byte[] doFinal = mac.doFinal(dataBytes);
			System.out.println("加密之前"+doFinal.toString());
			char[] hexB = Hex.encode(doFinal);
			return String.valueOf(hexB);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String digest(String key, Map<String, ?> map) {
		StringBuilder s = new StringBuilder();
		for (Object values : map.values()) {
			if (values instanceof String[]) {
				for (String value : (String[]) values) {
					s.append(value);
				}
			} else if (values instanceof List) {
				for (String value : (List<String>) values) {
					s.append(value);
				}
			} else {
				s.append(values);
			}
		}
		System.out.println("排序完后的内容:"+s.toString());
		return digest(key, s.toString());
	}
}
