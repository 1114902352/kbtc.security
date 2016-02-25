package com.ai.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis操作工具类
 */
public class JedisPoolUtils {
	private static String ip;
	private static int port;
	private static int maxTotal;
	private static int waitMill;
	private static int maxIdle;
	private static boolean testOnBorrow;
	private static boolean isOpen;
	private static JedisPool pool;

	static {
		Properties prop = new Properties();
		InputStream in = Object.class.getResourceAsStream("/redis.properties");
		try {
			prop.load(in);
			ip = prop.getProperty("redis.host").trim();
			port = Integer.parseInt(prop.getProperty("redis.port").trim());
			maxTotal = Integer.parseInt(prop.getProperty("redis.maxTotal").trim());
			waitMill = Integer.parseInt(prop.getProperty("redis.waitMill").trim());
			maxIdle = Integer.parseInt(prop.getProperty("redis.maxIdle").trim());
			testOnBorrow = ("true").equals(prop.getProperty("redis.testOnBorrow").trim()) ? true : false;
			isOpen = ("true").equals(prop.getProperty("redis.isOpen").trim()) ? true : false;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 建立连接池 真实环境，一般把配置参数缺抽取出来。
	 * @throws Exception 
	 * 
	 */
	private static void createJedisPool() throws Exception {
		if(!isOpen){
			throw new Exception("Redis的连接未开启");
		}
		// 建立连接池配置参数
		JedisPoolConfig config = new JedisPoolConfig();
		// 设置最大连接数
		config.setMaxTotal(maxTotal);
		// 设置最大阻塞时间，记住是毫秒数milliseconds
		config.setMaxWaitMillis(waitMill);
		// 设置空间连接
		config.setMaxIdle(maxIdle);
		config.setTestOnBorrow(testOnBorrow);
		// 创建连接池
//		pool = new JedisPool(config, "10.8.16.173", 6666);
		pool = new JedisPool(config, ip, port);
	}

	/**
	 * 在多线程环境同步初始化
	 * @throws Exception 
	 */
	private static synchronized void poolInit() throws Exception {
		if (pool == null)
			createJedisPool();
	}

	/**
	 * 获取一个jedis 对象
	 * 
	 * @return
	 * @throws Exception 
	 */
	public static Jedis getJedis() throws Exception {
		if (pool == null)
			poolInit();
		return pool.getResource();
	}

	/**
	 * 归还一个连接
	 * 
	 * @param jedis
	 */
	public static void returnRes(Jedis jedis) {
		if(jedis!=null){
			pool.returnResource(jedis);
		}
	}

}
