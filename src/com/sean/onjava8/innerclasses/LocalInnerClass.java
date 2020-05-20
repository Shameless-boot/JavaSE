package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-05-01 17:56
 * @description: TODO
 */

interface Counter {
    int next();
}
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        }

        return new LocalCounter();
    }

    Counter getCounter2(String name) {
        return new Counter() {
            // 实例初始化
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass li = new LocalInnerClass();

        Counter c = li.getCounter2("Anonymous inner"),
                c2 = li.getCounter("local inner");
        for (int i = 0; i < 5; i++)
            System.out.println("    " + c.next());

        for (int i = 0; i < 5; i++)
            System.out.println("    " + c2.next());
    }
}
