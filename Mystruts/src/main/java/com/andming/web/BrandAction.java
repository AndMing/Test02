package com.andming.web;

import com.opensymphony.xwork2.ActionSupport;

public class BrandAction extends ActionSupport {
    private int name;
    public String hello() {
        System.out.println("接收到请求");
        return "success";
    }
    public void BrandAction(){

    }

    public BrandAction(int name) {
        this.name = name;
    }

    public BrandAction() {
    }
}
