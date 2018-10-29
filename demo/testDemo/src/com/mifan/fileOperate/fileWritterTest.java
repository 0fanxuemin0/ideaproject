package com.mifan.fileOperate;

import java.io.*;

/**
 * Created by fanxuemin on 2018/6/25.
 * 字符流的读、写操作
 */
public class fileWritterTest {
    public static void main(String[] args) {
        try {
            File f=new File("D:"+ File.separator+"file2.txt");
            Writer w=new FileWriter(f);
            String str="abc";
            w.write(str);
            w.close();
            Reader r=new FileReader(f);
            char[] chars=new char[1024];
            int a=r.read(chars);
            System.out.println(new String(chars,0,a));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
