package com.sean.onjava8.innerclasses;

import java.time.*;

/**
 * @author: Shaun
 * @create: 2020-04-26 16:04
 * @description: TODO
 */
public abstract class Event {
    private Instant eventTime;
    protected final Duration delayTime;

    public Event(long millisecondDelay) {
        delayTime = Duration.ofMillis(millisecondDelay);
        start();
    }

    public void start() {
        eventTime = Instant.now().plus(delayTime);
    }

    public boolean ready() {
        return Instant.now().isAfter(eventTime);
    }

    public abstract void action();

}
