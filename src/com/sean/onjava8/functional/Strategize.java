package com.sean.onjava8.functional;

/**
 * @author: Shaun
 * @create: 2020-05-06 14:21
 * @description: 使用不同的方法实现Strategy接口
 */

interface Strategy {
    String approach(String msg);
}

// 使用一个类来实现接口
class Soft implements Strategy {
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    /**
        为什么得为静态方法
     *  这是因为我们下面代码在引用时是用：类名::方法名
     *  此时类并为加载进jvm，所以得是用static关键字，一旦引用到类名相关的就会加载static变量。
     */
    static String twice(String msg) {
        return msg + " " + msg;
    }
}


public class Strategize {
    private Strategy strategy;
    private String msg;

    public Strategize(String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() { // 使用实现了Strategy接口的一个匿名内部类
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase();
                    }
                },
                // 使用lambda表达式传递一个方法
                msg -> msg.substring(0, 5),
                // 使用::方法引用将Unrelated类中的twice方法传递给Strategy接口
                Unrelated::twice
        };
        Strategize s = new Strategize("Hello there");
        s.communicate();
        for (Strategy strategy : strategies) {
            s.changeStrategy(strategy);
            s.communicate();
        }
    }
}
