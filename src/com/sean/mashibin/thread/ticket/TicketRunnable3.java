package com.sean.mashibin.thread.ticket;

/**
 * @author: Shaun
 * @create: 2020-05-14 16:15
 * @description: TODO
 */
public class TicketRunnable3 implements Runnable{
    private int ticket = 5;

    @Override
    public void run() {
        while (ticket > 0) {
            sellTicket();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void sellTicket() {
        System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket-- + "票");
    }

    public static void main(String[] args) {
        TicketRunnable3 ticketRunnable = new TicketRunnable3();
        Thread t1 = new Thread(ticketRunnable,"A");
        Thread t2 = new Thread(ticketRunnable,"B");
        Thread t3 = new Thread(ticketRunnable,"C");
        Thread t4 = new Thread(ticketRunnable,"D");
        Thread t5 = new Thread(ticketRunnable,"E");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
