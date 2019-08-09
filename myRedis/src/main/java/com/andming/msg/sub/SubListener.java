package com.andming.msg.sub;

import redis.clients.jedis.JedisPubSub;

public class SubListener extends JedisPubSub {
    public void subscribe(String channel) {

        System.out.println(channel);

    }
}
