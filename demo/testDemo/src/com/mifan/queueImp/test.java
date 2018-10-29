package com.mifan.queueImp;

/**
 * Created by fanxuemin on 2018/6/30.
 */
public class test {
    public static void main(String[] args) {
        queue q=new queue<String>();
        for (int i=0;i<10;i++){
            q.push(new Integer(i).toString());
        }
        for (int i=0;i<10;i++){
            System.out.println(q.pull());
        }
    }
}
