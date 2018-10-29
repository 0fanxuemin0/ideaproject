package com.mifan.deadLock;

/**
 * Created by fanxuemin on 2018/6/30.
 */
public class model2 {
    public synchronized  void B(model1 m1) {
        try {
            Thread.sleep(1000);
            System.out.println("线程休眠1秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("model2.B() 等待m1的对象锁");
        synchronized (m1) {
            System.out.println("model2.B() 获取到m1的对象锁");
            System.out.println("model2.B() end");
        }
    }
}
