package com.jupiter.test05;

public class Test {
    public static void main(String[] args) {
        Product p = new Product();
        // 创建生产者、消费者线程
        ProducerThead pt = new ProducerThead(p);
        CustomerThread ct = new CustomerThread(p);

        pt.start();
        ct.start();
    }
}
