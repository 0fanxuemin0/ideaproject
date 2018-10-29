package com.mifan.staticClassTest;

/**
 * Created by fanxuemin on 2018/6/7.
 */
public  class car {

 public  void car(){
     System.out.println("hello car");
 }
    public  static void run(){
        System.out.println("dudududu");
        A.C();
        new A().B();
    }
    public static class A{
        public void B(){
            System.out.println("B");
            run();
        }
        public static void C(){
            System.out.println("C");
        }
    }
}
