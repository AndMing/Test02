package com.andming.msg;

import com.andming.util.JedisUtils;
import redis.clients.jedis.Jedis;

public class PublishUtil {

    public static void publishMsg(String channel, String message) {
        Jedis jedis = JedisUtils.getJedis();
        try {

            jedis.publish(channel, message);

        } catch (Exception e) {

        }

    }
}
