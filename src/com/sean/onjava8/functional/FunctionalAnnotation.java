package com.sean.onjava8.functional;

/**
 * @author: Shaun
 * @create: 2020-05-06 16:13
 * @description: TODO
 */

@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

interface FunctionalNoAnn {
    String show(String arg);
}
public class FunctionalAnnotation {
    public String goodbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fn = fa::goodbye;

        Functional f1 = a -> "Goodbye, " + a;
        FunctionalNoAnn fn1 = a -> "Goodbye, " + a;
    }
}
