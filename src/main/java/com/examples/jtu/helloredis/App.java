package com.examples.jtu.helloredis;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Jedis jedis = new Jedis("redis");
        RedisClient redisClient = new RedisClient(jedis);
        
        while(true) {
        	try {
        		Thread.sleep(5000);
        		System.out.println("pinging redis server: " + redisClient.pingRedis());
        	}
        	catch (Exception e) {
        		System.out.println(e.getMessage());
        	}
        		
        }
    }
}
