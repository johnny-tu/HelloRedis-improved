package com.examples.jtu.helloredis;

import redis.clients.jedis.Jedis;

public class RedisClient {
	
	private Jedis jedis;
	
	public static final String SUCCESS = "success";
	public static final String FAIL = "No response from redis";

	public RedisClient(Jedis jedis) {
		this.jedis =jedis;
	}

	public String pingRedis() {
		
		String jedisRespose = jedis.ping();
		
		if( jedisRespose.equalsIgnoreCase("pong")) {
			return SUCCESS;
		}
		
		return FAIL;
	}
}
