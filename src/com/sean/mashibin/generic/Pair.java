package com.sean.mashibin.generic;

import java.util.function.Supplier;

public class Pair<T> {
    private T first;
    private T second;

    public Pair() {

    }

    public static <T> Pair<T> makePair(Supplier<T> supplier) {
        return new Pair<>(supplier.get(), supplier.get());
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
