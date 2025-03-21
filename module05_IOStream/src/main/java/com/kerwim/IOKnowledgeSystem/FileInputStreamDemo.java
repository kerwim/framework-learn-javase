package com.kerwim.IOKnowledgeSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        // 声明一个 int 类型的变量 b，用于存储读取到的字节
        int b;

        // 创建一个 FileInputStream 对象，用于读取文件 fis.txt 中的数据
        FileInputStream fis1 = new FileInputStream("fis.txt");

        // 循环读取文件中的数据
        while ((b = fis1.read()) != -1) {
            // 将读取到的字节转换为对应的 ASCII 字符，并输出到控制台
            System.out.println((char)b);
        }

        // 关闭 FileInputStream 对象，释放资源
        fis1.close();
    }
}
