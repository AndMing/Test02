package com.andming.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {

    @RequestMapping("login")
    public String login(){
        /*System.out.println(user.getName());
        System.out.println(user.getPassword());*/
        return "aa";
    }

}
