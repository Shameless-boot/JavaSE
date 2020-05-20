package com.sean.mashibin.generic;

import java.util.function.Supplier;

public class HasF<T> {
    T t;
    public void f(Supplier<T> supplier) {
        t = supplier.get();
        System.out.println("HasF.f()" + t) ;
    }

    public static void main(String[] args) {
        new HasF<String>().f(() -> "Hello");
    }
}
