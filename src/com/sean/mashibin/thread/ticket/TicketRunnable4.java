package com.sean.mashibin.thread.ticket;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Shaun
 * @create: 2020-05-14 16:15
 * @description: TODO
 */
public class TicketRunnable4 implements Runnable{
    private int ticket = 5;
    // declare a lock
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            while (ticket > 0) {
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket-- + "票");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        TicketRunnable4 ticketRunnable = new TicketRunnable4();
        Thread t1 = new Thread(ticketRunnable);
        Thread t2 = new Thread(ticketRunnable);
        Thread t3 = new Thread(ticketRunnable);
        Thread t4 = new Thread(ticketRunnable);
        Thread t5 = new Thread(ticketRunnable);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
