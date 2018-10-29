package com.mifan.uploadOrderOfFatherSon;

/**
 * Created by fanxuemin on 2018/6/22.
 */
public class man extends person{
    static {
        System.out.println("static man");
    }
    {
        System.out.println("man");
    }
    man(){
        System.out.println("i am man constructor");
    }

    public static void main(String[] args) {
        man m=new man();
        System.out.println("i am man");
    }
}
