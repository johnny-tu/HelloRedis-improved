package com.examples.jtu.helloredis;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import redis.clients.jedis.Jedis;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

	private RedisClient redisClient;

	@Mock
	private Jedis jedis;

	@Before
	public void setUp() {
		redisClient = new RedisClient(jedis);
	}

	@org.junit.Test
	public void testRedisPing() throws Exception {
		// given 
		when(jedis.ping()).thenReturn("pong");

		// when
		String response = redisClient.pingRedis();
		
		//expect
		assertEquals(response, RedisClient.SUCCESS);
	}
	
	@org.junit.Test
	public void testRedisPingFailing() throws Exception {
		// given 
		when(jedis.ping()).thenReturn("error");

		// when
		String response = redisClient.pingRedis();
		
		//expect
		assertEquals(response, RedisClient.FAIL);
	}

}
