package com.sean.onjava8.functional;

import java.util.function.BiConsumer;

/**
 * @author: Shaun
 * @create: 2020-05-07 14:22
 * @description: TODO
 */

class In1 {

}

class In2 {

}

public class MethodConversion {
    static void accept(In1 i1, In2 in2) {
        System.out.println("accept()");
    }

    static void someOtherName(In1 i1, In2 in2) {
        System.out.println("someOtherName");
    }

    public static void main(String[] args) {
        BiConsumer<In1, In2> bic;

        bic = MethodConversion::accept;
        bic.accept(new In1(), new In2());

        bic = MethodConversion::someOtherName;
        // bic don't have a method named someOtherName
        // bic.someOtherName(new In1(), new In2());
        bic.accept(new In1(), new In2());

    }
}
