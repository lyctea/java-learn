package com.jupiter.test01;

/**
 * 线程类
 * 继承Thread类
 */
public class TestThread extends Thread {

    /**
     * 线程对象争抢资源，线程需要执行的任务是什么
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
