package com.andming.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

public class JedisUtils {

    private static JedisPool pool;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("jedis");
        String host = bundle.getString("jedis.host");
        String port = bundle.getString("jedis.port");
        String maxTotal = bundle.getString("jedis.maxTotal");
        String maxIdle = bundle.getString("jedis.maxIdle");

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(maxTotal));
        config.setMaxIdle(Integer.parseInt(maxIdle));

        pool = new JedisPool(config,host,Integer.parseInt(port));
    }
    //获取Jedis对象
    public static Jedis getJedis(){
        return pool.getResource();
    }
    //关闭连接
    public static void close(Jedis jedis){
        if(jedis!=null){
            jedis.close();
        }
    }

}
