package com.andming.web;

import java.util.concurrent.TimeUnit;

class Ars{
    volatile int num=20;
    public void add(){
        this.num=22;
    }
}

public class Cdd {



    public static void main(String[] args) {
       Ars ars = new Ars();


        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"进来了");
            try {
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            ars.add();
            System.out.println(Thread.currentThread().getName()+"修改后："+ars.num);
        },"A1").start();

        while (ars.num==20){
            /*System.out.println(1);*/
        }

        System.out.println(Thread.currentThread().getName()+"主线程收到结果"+ars.num);
    }


}
