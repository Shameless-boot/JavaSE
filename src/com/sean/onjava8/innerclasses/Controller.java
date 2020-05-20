package com.sean.onjava8.innerclasses;

import java.util.*;

/**
 * @author: Shaun
 * @create: 2020-04-26 16:09
 * @description: TODO
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void run() {
        while (eventList.size() > 0) {

            for (Event event : new ArrayList<>(eventList))
                if (event.ready()) {
                    System.out.println(event);
                    event.start();
                    eventList.remove(event);
                }

        }
    }
}
