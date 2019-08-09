package com.andming.web;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class A  {
    public static void main(String[] args)throws Exception {

        Runnable runnable = new Runnable() {

            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,5, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        System.out.println(executor.getCorePoolSize());
        System.out.println(executor.getPoolSize());
        System.out.println(executor.getQueue().size());

    }

}
