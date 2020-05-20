package com.sean.mashibin.generic;

public class SimpleHolder<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public static void main(String[] args) {
        SimpleHolder<String> simpleHolder = new SimpleHolder<>();
        simpleHolder.setElement("123");
        String element = simpleHolder.getElement();
        System.out.println(element);
    }
}
