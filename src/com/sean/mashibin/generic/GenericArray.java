package com.sean.mashibin.generic;

public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int size) {
        array = (T[])new Object[size];
    }

    public void set(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        try {
            Integer[] rep = gai.rep();
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        Object[] obj = gai.rep();
    }
}
