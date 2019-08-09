package com.andming.test;

import com.andming.domain.TbBrand;

import java.util.HashMap;

public class Test05 {
    public static void main(String[] args)throws Exception {
        String a="1111";
        String b="111"+"1";
        TbBrand brand = new TbBrand();
        TbBrand tbBrand = new TbBrand();
        short s=1;
        s+=1;
        System.out.println();
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"aa");
        map.put(1,"cc");
        System.out.println(map.get(1));
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        Class.forName("").getClassLoader();

    }
    public static String getType(Object o){

        return o.getClass().toString();

    }

}
