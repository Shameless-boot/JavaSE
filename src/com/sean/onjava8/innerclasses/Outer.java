package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-05-02 17:29
 * @description: TODO
 */
public class Outer {
    private int i = 0;


    public void test(int i) {
        //int a = 10;
        new Thread() {
            @Override
            public void run() {
                System.out.println(i);
                //System.out.println(a);
            }
        }.start();
    }

    public static void main(String[] args) {
    }
}
