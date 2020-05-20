package com.sean.mashibin.generic;

public class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T obj) {
        this.obj = obj;
    }

    // 泛型变量中存在限定类型变量的话，将会把泛型变量擦除成第一个限定的类型变量
    // 在此例子中，也就是说obj的类型会被擦除成HasF或者它的子类，而不是Object
    public void manipulate() {
        //obj.f();
    }
}
