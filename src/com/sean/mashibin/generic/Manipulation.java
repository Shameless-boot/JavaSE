package com.sean.mashibin.generic;

public class Manipulation {
    public static void main(String[] args) {
        HasF f = new HasF();
        Manipulator2<HasF> manipulator2 = new Manipulator2<>(f);
        manipulator2.manipulate();
        HasF s = new HasG();
    }
}
