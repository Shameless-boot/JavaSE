package com.sean.onjava8.functional;

/**
 * @author: Shaun
 * @create: 2020-05-06 15:55
 * @description: TODO
 */

class This {
    void two(int i, double d) {

    }

    void three(int i, double d, String s) {

    }

    void four(int i, double d, String s, char c) {

    }
}

interface TwoArgs {
    void call2(This aThis, int i, double d);
}

interface ThreeArgs {
    void call3(This aThis, int i, double d, String s);
}

interface FourArgs {
    void call4(This aThis, int i, double d, String s, char c);
}

public class MultiUnbound {
    public static void main(String[] args) {
        TwoArgs twoArgs = This::two;
        ThreeArgs threeArgs = This::three;
        FourArgs fourArgs = This::four;
        This t = new This();
        twoArgs.call2(t,10,3.1415);
        threeArgs.call3(t,10,3.1415,"hh");
        fourArgs.call4(t,10,3.1415,"hh",'a');
    }
}
