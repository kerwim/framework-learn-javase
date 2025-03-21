package com.kerwim.IOKnowledgeSystem;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        // 声明一个 int 类型的变量 b，用于存储读取到的字符
        int b = 0;

        // 创建一个 FileReader 对象，用于读取文件 read.txt 中的数据
        FileReader fileReader = new FileReader("read.txt");

        // 循环读取文件中的数据
        while ((b = fileReader.read()) != -1) {
            // 将读取到的字符强制转换为 char 类型，并输出到控制台
            System.out.println((char)b);
        }

        // 关闭 FileReader 对象，释放资源
        fileReader.close();
    }
}
