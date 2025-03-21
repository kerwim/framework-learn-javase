package com.kerwim.IOKnowledgeSystem;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 */
public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        // 创建一个 FileWriter 对象，用于写入数据到文件 fw.txt 中
        FileWriter fileWriter = new FileWriter("fw.txt");

        // 将字符串 "kerwim" 转换为字符数组
        char[] chars = "kerwim".toCharArray();

        // 向文件中写入数据，这里写入的是 chars 数组中的所有字符
        fileWriter.write(chars, 0, chars.length);

        // 关闭 FileWriter 对象，释放资源
        fileWriter.close();
    }
}
