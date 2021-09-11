package com.jupiter.test04;

import java.util.Random;
import java.util.concurrent.Callable;


/**
 * 通过Callable接口创建线程
 * 1、可以有返回值
 * 2、可以抛出异常
 * 3、缺点是创建过程比较麻烦，三次嵌套创建
 */
public class TestRandomNum implements Callable<Integer> {

    /**
     * 1、实现Callable接口，可以不带泛型，如果不带泛型，Callable的返回值是Object，
     * 2、如果带泛型，则是泛型类型
     * 3、从call方法看到，方法有返回值，可以抛出异常
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10); //返回10以内的随机数
    }
}
