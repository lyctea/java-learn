package com.jupiter.test05;

/**
 * 生产者线程
 */
public class ProducerThead extends Thread {
    // 共享商品
    private Product p;

    public ProducerThead(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { //生产10个商品
            synchronized (p) {
                if (i % 2 == 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 生产费列罗巧克力
                    p.setBrand("费列罗");
                    p.setName("巧克力");
                } else {
                    //生产哈尔滨啤酒
                    p.setBrand("哈尔滨");
                    p.setName("啤酒");
                }

                // 打印生产信息
                System.out.println("生产者生产了:" + p.getBrand() + "---" + p.getName());
            }
        }
    }
}
