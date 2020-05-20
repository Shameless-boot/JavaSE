package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-26 15:11
 * @description: 两种方式实现多个接口：1）一个类直接impl多个接口。
 * 2）使用内部类来impl一部分接口。
 */

interface A {
}

interface B {

}

class X implements A, B {
}

class Y implements A {
    B makeB() {
        // 匿名类
        return new B() { };
    }
}

public class MultiInterfaces {
    static void takeA(A a) {

    }

    static void takeB(B b) {

    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        takeA(x);
        takeA(y);
        takeB(x);
        takeB(y.makeB());

    }
}
