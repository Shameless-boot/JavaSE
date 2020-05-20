package com.sean.onjava8.functional;


/**
 * @author: Shaun
 * @create: 2020-05-06 15:10
 * @description: TODO
 */

interface Callable {
    void call(String s);
}

class Describe {
    void show(String msg) {
        System.out.println(msg);
    }
}
public class MethodReferences {
    static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    static class Description {
        private String about;

        public Description(String msg) {
            this.about = msg;
        }

        void help(String msg) {
            System.out.println(about + " " + msg);
        }
    }

    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Describe d = new Describe();
        Callable c = d::show;
        c.call("call()");

        c = MethodReferences::hello;
        c.call("Shaun");

        c = new Description("valuable")::help;
        c.call("information");

        c = Helper::assist;
        c.call("Help!");

    }
}
