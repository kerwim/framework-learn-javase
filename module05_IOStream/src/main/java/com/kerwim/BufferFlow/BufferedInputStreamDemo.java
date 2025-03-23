package com.kerwim.BufferFlow;

import java.io.*;

/**
 *
 */
public class BufferedInputStreamDemo {

    public static void main(String[] args) throws IOException {
        demo4();
    }


    public static void demo1() throws FileNotFoundException {
        // 创建字节缓冲输入流，先声明字节流
        FileInputStream fps = new FileInputStream("b.txt");
        BufferedInputStream bis = new BufferedInputStream(fps);

        // 创建字节缓冲输入流（一步到位）
        //BufferedInputStream bis = new BufferedInputStream(new FileInputStream("b.txt"));

        // 创建字节缓冲输出流（一步到位）
        //BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
    }

    public static void demo2() throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 创建流对象
        try (FileInputStream fis = new FileInputStream("123.pdf");//文件够大
             FileOutputStream fos = new FileOutputStream("copy123.pdf")){
            // 读写数据
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:"+(end - start)+" 毫秒");
    }

    public static void demo3() throws FileNotFoundException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 创建流对象
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("123.pdf"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy123.pdf"));){
            // 读写数据
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:"+(end - start)+" 毫秒");
    }

    public static void demo4() throws FileNotFoundException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 创建流对象
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("123.pdf"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy123.pdf"));){
            // 读写数据
            int len;
            byte[] bytes = new byte[8*1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0 , len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间:"+(end - start)+" 毫秒");
    }


}
