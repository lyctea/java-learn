package com.jupiter.test05;

public class CustomerThread extends Thread {
    // 共享商品
    private Product p;

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // i消费次数
            synchronized (p) {
                System.out.println("消费者消费了：" + p.getBrand() + "---" + p.getName());
            }
        }
    }
}
