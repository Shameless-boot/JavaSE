package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-24 21:31
 * @description: 获取外部类对象
 */
public class DoThis {
    private void f() {
        System.out.println("DoThis.f()");
    }

    public class Inner {
        public DoThis outer() {
            return DoThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        DoThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
