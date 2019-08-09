package com.andming.msg;

import com.andming.util.JedisUtils;
import redis.clients.jedis.Jedis;

public class SublishUtil {

    public static void getMsg(String a) {
        Jedis jedis = JedisUtils.getJedis();
        /*try {

            jedis.subscribe(jedisPubSub,channel);

        } catch (Exception e) {

        }*/
        final String qq = jedis.get(a);
        System.out.println(qq);

    }
}
