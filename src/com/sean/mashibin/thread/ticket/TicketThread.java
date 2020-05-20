package com.sean.mashibin.thread.ticket;

/**
 * @author: Shaun
 * @create: 2020-05-14 16:15
 * @description: TODO
 */
public class TicketThread extends Thread{
    private static int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            if (ticket > 0)
                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket-- + "票");

    }

    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();
        TicketThread t5 = new TicketThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
