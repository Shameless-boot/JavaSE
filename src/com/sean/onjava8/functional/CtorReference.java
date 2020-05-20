package com.sean.onjava8.functional;

/**
 * @author: Shaun
 * @create: 2020-05-06 16:07
 * @description: TODO
 */

class Dog {
    private String name;
    private int age = -1;

    public Dog() {
        name = "stray";
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface MakeNoArgs {
    Dog make();
}

interface Make1Args {
    Dog make(String name);
}

interface Make2Args {
    Dog make(String name, int age);
}

public class CtorReference {
    MakeNoArgs mna = Dog::new;
    Make1Args m1a = Dog::new;
    Make2Args m2a = Dog::new;

    Dog dn = mna.make();
    Dog d1 = m1a.make("Steve");
    Dog d2 = m2a.make("Frank", 15);
}
