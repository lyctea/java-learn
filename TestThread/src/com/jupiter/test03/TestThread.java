package com.jupiter.test03;

/**
 * 实现了这个接口，才会变成一个线程类
 *
 * QA:在实际开发中，方式一 继承Thread类 方式二 实现Runable接口
 * 1、方式一基于继承有一局限性，继承了Thread类就不能继承别的类了
 * 2、方式二共享资源的能力也会更强一些，不需要非得加个static来修饰
 * 3、
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }
}
