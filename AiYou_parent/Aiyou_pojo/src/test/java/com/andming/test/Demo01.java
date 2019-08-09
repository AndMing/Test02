package com.andming.test;

import com.andming.pojo.User;
import org.junit.Test;

/**
 * 功能描述
 *
 * @ClassName: Demo01
 * @author: 明明 E-mail:andming5@126.com
 * @date: 2019/8/9 12:10
 * @Version: 1.0
 */
public class Demo01 {
    @Test
    public void setTest(){
        User user = new User();
        user.setId(1);
        user.setName("dd");
        System.out.println(user);
    }
}
