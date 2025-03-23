package com.kerwim.BufferFlow;

import java.io.*;

/**
 *
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        demo2();
    }

    public static void demo1() throws IOException {
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        // 定义字符串,保存读取的一行文字
        String line  = null;
        // 循环读取,读取到最后返回null
        while ((line = br.readLine())!=null) {
            System.out.print(line);
            System.out.println("------");
        }
        // 释放资源
        br.close();
    }

    public static void demo2() throws IOException {
        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        // 写出数据
        bw.write("我");
        // 写出换行
        bw.newLine();
        bw.write("是");
        bw.newLine();
        bw.write("靓");
        bw.newLine();
        bw.write("仔");
        bw.newLine();
        // 释放资源
        bw.close();
    }

}
