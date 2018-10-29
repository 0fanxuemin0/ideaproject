package com.mifan.fileOperate;

import java.io.*;

/**
 * Created by fanxuemin on 2018/6/25.
 * 字节流的输出：向文件中写入内容；输入：从文件中读取内容。
 */
public class fileInputStreamTest {
    public static void main(String[] args) {
        try {
            File f=new File("d:"+ File.separator+"file1.txt");
            OutputStream out=new FileOutputStream(f);
            String str="hello123";
            byte[] b=str.getBytes();
            out.write(b);
            out.close();
            InputStream input=new FileInputStream(f);
            byte[] d=new byte[3];
            int a;
            while((a=input.read(d))!=-1){
                System.out.print(new String(d,0,a));
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
