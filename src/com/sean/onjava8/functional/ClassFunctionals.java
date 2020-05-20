package com.sean.onjava8.functional;

import java.util.Comparator;
import java.util.function.*;

/**
 * @author: Shaun
 * @create: 2020-05-07 14:30
 * @description: TODO
 */

class AA {

}

class BB {

}

class CC {

}
public class ClassFunctionals {
    static AA f1() {
        return new AA();
    }
    static int f2(AA aa1, AA aa2) {
        return 1;
    }
    static void f3(AA aa) {

    }

    static void f4(AA aa, BB bb) {

    }

    static CC f5(AA aa) {
        return new CC();
    }

    static CC f6(AA aa, BB bb) {
        return new CC();
    }

    static boolean f7(AA aa) {
        return true;
    }

    static boolean f8(AA aa, BB bb) {
        return true;
    }

    static AA f9(AA aa) {
        return new AA();
    }

    static AA f10(AA aa1, AA aa2) {
        return new AA();
    }


    public static void main(String[] args) {
        // 无参数，返回一个对象
        // T get();
        Supplier<AA> s = ClassFunctionals::f1;
        s.get();

        // 接受两个同一类型的对象，返回int值。
        // int compare(T var1, T var2);
        Comparator<AA> c = ClassFunctionals::f2;
        c.compare(new AA(), new AA());

        // 接受一个对象，无返回值
        // void accept(T var1);
        Consumer<AA> cons = ClassFunctionals::f3;
        cons.accept(new AA());

        // 接受两个不同的对象，无返回值
        // void accept(T var1, U var2);
        BiConsumer<AA, BB> bic = ClassFunctionals::f4;
        bic.accept(new AA(), new BB());

        // 接受两个不同类型的类型变量，并且返回类型为后一种类型变量。
        // Function<T,R>
        // R apply(T var1);
        Function<AA, CC> func = ClassFunctionals::f5;
        CC cc = func.apply(new AA());

        // 接受三个不同类型的类型变量，并且返回类型为最后一种类型变量。
        // BiFunction<T,U,R>
        // R apply(T var1, U var2);
        BiFunction<AA, BB, CC> bif = ClassFunctionals::f6;
        CC c2 = bif.apply(new AA(), new BB());

        // 接受一个对象为形参，并且返回布尔值
        // boolean test(T var1);
        Predicate<AA> p = ClassFunctionals::f7;
        boolean result = p.test(new AA());

        // 接受两个不同类型对象为形参，并且返回布尔值
        // boolean test(T var1, U var2);
        BiPredicate<AA, BB> bip = ClassFunctionals::f8;
        result = bip.test(new AA(), new BB());

        // 接受一个对象形参，形参类型和返回类型相同
        // T apply(T var1);
        UnaryOperator<AA> up = ClassFunctionals::f9;
        up.apply(new AA());

        // 接受两个对象形参，形参类型和返回类型相同
        // T apply(T var1, T var2);
        BinaryOperator<AA> bp = ClassFunctionals::f10;
        bp.apply(new AA(), new AA());
    }
}
