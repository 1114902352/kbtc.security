package com.ai.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerializeUtils {

	/**
	 * 对象序列化为字符串
	 */
	public static String serialize(Object obj) throws Exception {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(obj);
		String serStr = byteArrayOutputStream.toString("ISO-8859-1");// 必须是ISO-8859-1
		serStr = java.net.URLEncoder.encode(serStr, "UTF-8");// 编码后字符串不是乱码（不编也不影响功能）
		objectOutputStream.close();
		byteArrayOutputStream.close();
		return serStr;
	}

	/**
	 * 字符串 反序列化为 对象
	 */
	public static Object unSerialize(String serStr) throws Exception {
		String redStr = java.net.URLDecoder.decode(serStr, "UTF-8");
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(redStr.getBytes("ISO-8859-1"));
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		Object obj = objectInputStream.readObject();
		objectInputStream.close();
		byteArrayInputStream.close();
		return obj;
	}

	public static void main(String[] args) throws Exception {
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("number", "123");
		map.put("name", "test");
		list.add(map);
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("number", "1232");
		map2.put("name", "test2");
		list.add(map2);

		String str = new String(serialize(list));
		System.err.println(str);
		List<HashMap<String, String>> newList = (List<HashMap<String, String>>) unSerialize(str);
		for (Map m : newList) {
			System.out.println(m.get("number") + " " + m.get("name"));
		}
	}
}