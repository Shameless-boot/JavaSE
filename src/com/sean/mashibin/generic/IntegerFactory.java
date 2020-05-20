package com.sean.mashibin.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class IntegerFactory implements Supplier<Integer> {
    private int id = 0;


    @Override
    public Integer get() {
        return ++id;
    }
}

class Widget {
    private int id;

    public Widget(int id) {
        this.id = id;
    }

    public static class Factory implements Supplier<Widget> {
        private int i = 0;
        @Override
        public Widget get() {
            return new Widget(++i);
        }
    }

    @Override
    public String toString() {
        return "Widget " + id;
    }
}

class Fudge {
    private static int count = 1;
    private int n = count++;

    @Override
    public String toString() {
        return "Fudge" + n;
    }
}

class Fool2<T> {
    private List<T> list = new ArrayList<>();

    public Fool2(Supplier<T> factory) {
        Suppliers.fill(list, factory, 4);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class FactoryConstraint {
    public static void main(String[] args) {
        System.out.println(new Fool2<>(new IntegerFactory()));
        System.out.println(new Fool2<>(new Widget.Factory()));
        System.out.println(new Fool2<>(Fudge::new));
    }
}
