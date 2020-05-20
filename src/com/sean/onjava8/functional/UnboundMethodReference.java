package com.sean.onjava8.functional;

/**
 * @author: Shaun
 * @create: 2020-05-06 15:34
 * @description: TODO
 */

class X {
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transformX(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        // MakeString ms = X::f;
        TransformX sp = X::f;
        X x = new X();
        System.out.println(x.f());
        System.out.println(sp.transformX(x));
    }
}
