package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-24 21:36
 * @description: Creating an inner class directly using .new syntax
 */
public class DoNew {
    private int i = 10;
    private static int j = 10;
    public static class Inner {
        void f() {
            //System.out.println(i); // 无法访问外围类非静态成员
            System.out.println(j); // 可以访问外围类静态成员
        }
    }

    class CC {
        static final int i = 0;

    }

    public static void main(String[] args) {
        DoNew doNew = new DoNew();
        DoNew.Inner dni = new Inner();
        DoNew.Inner dni2 = new Inner();
    }
}
