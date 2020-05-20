package com.sean.mashibin.generic;

class GenericBase<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

class Derived1<T> extends GenericBase<T> {

}

class Derived2 extends GenericBase { }

//  Error
//class Derived3 extends GenericBase<?> { }

@SuppressWarnings("unchecked")
public class ErasureAndInteritance {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = new Derived2();
        d2.setElement(obj); // warning here
    }
}
