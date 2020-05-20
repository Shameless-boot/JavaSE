package com.sean.onjava8.functional;

import org.w3c.dom.ls.LSOutput;

/**
 * @author: Shaun
 * @create: 2020-05-06 14:50
 * @description: lambda表达式的应用
 */

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

public class LambdaExpressions {
    static Body bod = h ->  h + "No parents";
    static Body bod2 = (h) -> h + "More details";
    static Description desc = () -> "Short Info";
    static Multi multi = (h, n) -> h + n;

    static Description moreLines = () -> {
        System.out.println("moreLines()");
        return "from MoreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(multi.twoArg("Pi! ", 3.141596));
        System.out.println(moreLines.brief());
    }
}
