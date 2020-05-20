package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-26 15:18
 * @description: TODO
 */
class D {

}

abstract class E {

}

class Z extends D {
    E makeE() {
        // 返回一个继承与E的匿名内部类
        return new E() {};
    }
}
public class MultiImplementation {
    static void takeD(D d) {

    }

    static void takeE(E e) {

    }

    public static void main(String[] args) {
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());
    }
}
