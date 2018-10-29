package com.mifan.deadLock;

/**
 * Created by fanxuemin on 2018/6/30.
 */
public class test {
    //死锁模拟
    public static void main(String[] args) {
        final model1 m1=new model1();
        final model2 m2=new model2();

        new Thread(){
            @Override
            public void run(){
                System.out.println("线程1开始执行并调用model.A()");
        m1.A(m2);
        }
        }.start();
/*        try {
            Thread.sleep(3000);
            System.out.println("线程休眠3秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        new Thread(){
            @Override
            public void run(){
                System.out.println("线程1开始执行并调用mode2.B()");
                m2.B(m1);
            }
        }.start();

    }
}
