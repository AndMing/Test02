package com.andming.test;

public class Test06 {
    public static void main(String[] args) {
        String a="   fnk kfd";
        System.out.println(a.length());
        int tr = tr();
        System.out.println(tr);
    }
    public static int tr() {

        try {
            int i=1/0;
            return 1;
        }catch (Exception e){

            return 2;
        }finally {
            return 3;
        }

    }
}
