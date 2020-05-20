package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-26 15:05
 * @description: 一个内部类不管被嵌套了多少层，他都可以访问外部类的所有外部成员。
 */
public class MNA {
    private void f() {

    }

    class B {
        private void g() {

        }

        public class C {
            void h() {
                g();
                f();
            }
        }
    }

    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.B mnab = mna.new B();
        MNA.B.C mnabc = mnab.new C();
        mnabc.h();
    }
}
