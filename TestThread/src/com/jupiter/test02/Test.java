package com.jupiter.test02;

public class Test {
    public static void main(String[] args) {
        // 多个窗口抢票
        BuyTicketThread t1 = new BuyTicketThread("A");
        t1.start();
        BuyTicketThread t2 = new BuyTicketThread("B");
        t2.start();
        BuyTicketThread t3 = new BuyTicketThread("C");
        t3.start();
    }
}
