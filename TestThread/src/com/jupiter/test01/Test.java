package com.jupiter.test01;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 主线程中，也要输出10个数字
        Thread.currentThread().setName("主线程");

        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "1" + i);
        }
        // 制造其他线程，和主线程争抢资源
        TestThread tt = new TestThread("子线程");
//        tt.run(); // 调用run方法，执行线程中的任务 run方法不能直接调用，直接调用就会被当做一个普通的方法；
        // tt起作用要调用父类 start方法
        tt.start();

        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "2" + i);
        }
    }
}
