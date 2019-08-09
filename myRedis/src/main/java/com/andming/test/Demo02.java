package com.andming.test;

import com.andming.util.JedisUtils;
import redis.clients.jedis.Jedis;

public class Demo02 {

    public static void main(String[] args) {
        Jedis jedis = JedisUtils.getJedis();
        jedis.set("name","ww");
        System.out.println(jedis.get("name"));
        jedis.close();

    }
}
