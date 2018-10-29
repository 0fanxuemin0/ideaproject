package com.mifan.deadLock;


/**
 * Created by fanxuemin on 2018/6/30.
 */
public class model1 {
    public synchronized void A(model2 m2) {
        try {
            Thread.sleep(1000);
            System.out.println("线程休眠1秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("model1.A() 等待m2的对象锁");
        synchronized (m2) {
            System.out.println("model1.A() 获取到m2的对象锁");
            System.out.println("model1.A() end");
        }
    }
}
