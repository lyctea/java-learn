package com.jupiter.test02;

public class BuyTicketThread extends Thread {
    public BuyTicketThread(String name) {
        super(name);
    }

    static int ticketNum = 10; // 多个对象共享10张票

    /**
     * 每个对象执行的代码都放入run方法中
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (ticketNum > 0) { // 票数大于0才抢票
                System.out.println("我在" + this.getName() + "买到了北京到哈尔滨的第" + ticketNum-- + "张车票");
            }
        }
    }
}
