package com.sean.mashibin.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericArray2<T> {
    private Object[] array;

    public GenericArray2(int size) {
        array = new Object[size];
    }

    public void set(int index, T item) {
        array[index] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    public T[] rep() {
        return (T[]) array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> gia = new GenericArray2<>(10);
        for (int i = 0; i < 10; i++)
            gia.set(i,i);

        for (int i = 0; i < 10; i++)
            System.out.print(gia.get(i) + " ");
        System.out.println();

        try {
            Integer[] rep = gia.rep();
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }
}
