package com.sean.mashibin.generic;

import java.util.ArrayList;
import java.util.List;

public class ListMarker<T> {
    List<T> create() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ListMarker<String> marker = new ListMarker<>();
        List<String> stringList = marker.create();
        String str = "1";
        HasF hasF = new HasF();
        Object o = null;
        if (hasF instanceof HasF)
            System.out.println(0);
    }
}
