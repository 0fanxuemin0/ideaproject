package com.mifan.staticClassTest;

/**
 * Created by fanxuemin on 2018/6/7.
 */
public  class  bwmCar extends car {
    public  bwmCar(){
        System.out.println("start");
        super.car();
    }
public bwmCar(String a){
    System.out.println(a
    );
}



    public static void main(String[] args) {
        bwmCar b=new bwmCar();
        car.A.C();
        new car.A().B();
        A a=new car.A();
        a.B();
    }
}
