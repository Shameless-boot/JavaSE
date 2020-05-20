package com.sean.mashibin.generic;

public class Manipulator<T> {
    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    // 找不到f（）方法，这是因为泛型类型被擦除了，在JVM中视为Object类型。
    public void manipulate() {
//        obj.f();
    }
}
