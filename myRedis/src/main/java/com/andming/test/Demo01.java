package com.andming.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Demo01 {
    public static void main(String[] args) {
        // 使用Jedis操作redis数据库
        //1.创建Jedis对象(设置连接地址和端口)
        Jedis jedis = new Jedis("localhost", 6379);
        //2.操作redis数据库
        /*String set = jedis.set("name", "ss");
        System.out.println(set);*/
        String name = jedis.get("name");
        System.out.println(name);

       /* jedis.set("name1","刘涛");
        String name1 = jedis.get("name1");
        System.out.println(name1);*/

        //jedis.del("name1");
        //3.关闭连接
        jedis.close();

        JedisPool jedisPool = new JedisPool();
    }
}
