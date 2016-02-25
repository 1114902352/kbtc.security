package com.ai.util;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisManager {

	/**
	 * If the field already exists, and the HSET just produced an update of the
	 * value, 0 is returned, otherwise if a new field is created 1 is returned.
	 * 
	 * @param key
	 * @param value
	 * @param expire  到期时间毫秒
	 * @return statu code 
	 * @throws Exception
	 */
	public static String set(String key, String value, int expire) throws Exception {
		Jedis jedis = JedisPoolUtils.getJedis();
		String result = jedis.setex(key, expire, value);
		JedisPoolUtils.returnRes(jedis);
		return result;
	}

	/**
	 * Integer reply, specifically: an integer greater than 0 
	 * if one or more keys were removed 0 if none of the specified key existed
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static Long del(String key) throws Exception {
		Jedis jedis = JedisPoolUtils.getJedis();
		Long result = jedis.del(key);
		JedisPoolUtils.returnRes(jedis);
		return result;
	}

	/**
	 * 通过表达式查找
	 * @param pattern
	 * @return
	 * @throws Exception
	 */
	public static Set<String> keys(String pattern) throws Exception {
		Jedis jedis = JedisPoolUtils.getJedis();
		Set<String> result = jedis.keys(pattern);
		JedisPoolUtils.returnRes(jedis);
		return result;
	}

	/**
	 * 通过Key直接查找
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String get(String key) throws Exception {
		Jedis jedis = JedisPoolUtils.getJedis();
		String result = jedis.get(key);
		JedisPoolUtils.returnRes(jedis);
		return result;
	}
}
