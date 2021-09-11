package com.jupiter.test04;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 定义一个线程对象
        TestRandomNum trn = new TestRandomNum();
        FutureTask ft = new FutureTask(trn);
        Thread t = new Thread(ft);
        t.start();
        // 获取线程随机数，线程的返回值
        Object obj = ft.get();
        System.out.println(obj);
    }
}
