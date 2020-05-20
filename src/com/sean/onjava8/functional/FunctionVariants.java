package com.sean.onjava8.functional;

import java.util.function.*;

/**
 * @author: Shaun
 * @create: 2020-05-06 16:55
 * @description: TODO
 */
class Foo {

}

class Bar {
    Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }
}

class IBaz {
    int i;

    public IBaz(int i) {
        this.i = i;
    }
}

class LBaz {
    long l;

    public LBaz(long l) {
        this.l = l;
    }
}

class DBaz {
    double d;

    public DBaz(double d) {
        this.d = d;
    }
}

public class FunctionVariants {
    static Function<Foo, Bar> f1 = f -> new Bar(f);
    static IntFunction<IBaz> f2 = f -> new IBaz(f);
    static LongFunction<LBaz> f3 = l -> new LBaz(l);
    static DoubleFunction<DBaz> f4 = d -> new DBaz(d);
    static ToIntFunction<IBaz> f5 = f -> f.i;
    static ToLongFunction<LBaz> f6 = f -> f.l;
    static ToDoubleFunction<DBaz> f7 = f -> f.d;
    static IntToLongFunction f8 = i -> i;
    static IntToDoubleFunction f9 = i -> i;
    static LongToIntFunction f10 = l -> (int)l;
    static LongToDoubleFunction f11 = l -> l;
    static DoubleToIntFunction f12 = d -> (int)d;
    static DoubleToLongFunction f13 = d -> (long) d;


    public static void main(String[] args) {
        Bar bar = f1.apply(new Foo());
        IBaz ib = f2.apply(11);
        LBaz lb = f3.apply(11);
        DBaz db = f4.apply(11);
        int i = f5.applyAsInt(ib);
        long l = f6.applyAsLong(lb);
        double d = f7.applyAsDouble(db);
        l = f8.applyAsLong(i);
        d = f9.applyAsDouble(i);
        i = f10.applyAsInt(l);
        d = f11.applyAsDouble(l);
        i = f12.applyAsInt(d);
        l = f13.applyAsLong(d);
    }

}
