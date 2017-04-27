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
        
        System.out.println(redisClient.pingRedis());
    }
}
