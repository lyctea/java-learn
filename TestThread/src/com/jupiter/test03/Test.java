package com.jupiter.test03;

public class Test {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");

        // 创建子线程对象
        TestThread tt = new TestThread();
        Thread t = new Thread(tt, "子线程");
        t.start();

        // 主线程
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }
}
