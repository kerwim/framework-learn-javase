package com.kerwim.IOKnowledgeSystem;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        // 创建一个 FileOutputStream 对象，用于写入数据到文件 fos.txt 中
        FileOutputStream fos = new FileOutputStream("fos.txt");

        // 向文件中写入数据，这里写入的是字符串 "kerwim" 对应的字节数组
        fos.write("kerwim".getBytes());

        // 关闭 FileOutputStream 对象，释放资源
        fos.close();
    }
}
