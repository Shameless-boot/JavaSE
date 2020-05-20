package com.sean.mashibin.generic;

import java.util.function.Supplier;

public class ClassAsFactory<T> implements Supplier<T> {
    private Class<T> kind;

    public ClassAsFactory(Class<T> kind) {
        this.kind = kind;
    }

    @Override
    public T get() {
        try {
            return kind.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {
    @Override
    public String toString() {
        return "Employee";
    }
}

class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println(fe.get());


        ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        try {
            System.out.println(fi.get());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
