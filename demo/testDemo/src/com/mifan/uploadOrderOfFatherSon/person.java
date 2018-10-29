package com.mifan.uploadOrderOfFatherSon;

/**
 * Created by fanxuemin on 2018/6/22.
 */
public class person {
    static{
        System.out.println("static person");
    }
    {
        System.out.println("person");
    }
     person(){
         System.out.println("i am person constructor");
    }
}
