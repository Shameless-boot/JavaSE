package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-05-01 16:51
 * @description: TODO
 */
public class Circle {
    private double radius = 0.0;
    public static int count = 1;
    public Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println(radius * 3.14);
    }

    class Draw {
        void drawShape() {
            draw(); // 出现重名的方法时默认调用内部类
            Circle.this.draw(); // 显示使用外围类引用来调用外围类的同名方法
        }

        void draw() {
            System.out.println(radius); // 外围类的private变量
            System.out.println(count); // 外围类的全局静态变量
        }
    }
}
