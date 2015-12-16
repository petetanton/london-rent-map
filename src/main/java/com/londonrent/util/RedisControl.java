package com.londonrent.util;

//import com.lambdaworks.redis.RedisClient;
//import com.lambdaworks.redis.RedisConnection;
//import com.lambdaworks.redis.RedisURI;

import redis.clients.jedis.Jedis;

import java.util.List;

public enum RedisControl {
    INSTANCE;
    Jedis jedis;
//    RedisClient redisClient;
//    RedisConnection<String, String> connection;


    public void connect() {
        jedis = new Jedis("localhost");
//        if (null == redisClient) {
//            redisClient = new RedisClient(
//                    RedisURI.create("redis://localhost:6379"));
//            connection = redisClient.connect();
        }
    }


    public void disconnect() {
//        connection.close();
//        redisClient.shutdown();
    }

    public String ping() {
        return jedis.ping();
//        return connection.ping();
    }

    public void set(String key, String value) {
        jedis.set(key, value);
//        connection.set(key, value);
    }

    public String get(String key) {
        return jedis.get(key);
//        return connection.get(key);
    }

    public Long delete(List<String> keys) {
        Long noDeleted = 0L;
        for (String key : keys) {
//            noDeleted += connection.del(key);
        }
        return noDeleted;
    }

    public void setList(String key, String... values) {
//        connection.lpush(key, values);
    }
}
