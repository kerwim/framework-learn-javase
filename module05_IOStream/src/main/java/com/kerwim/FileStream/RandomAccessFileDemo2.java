package com.kerwim.FileStream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 */
public class RandomAccessFileDemo2 {
    public static void main(String[] args) {

        File file = new File("logs/javabetter/nihao.txt");

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            // 写入文件
            raf.writeUTF("Hello, kerwim!");

            // 将文件指针移动到文件开头
            raf.seek(0);

            // 读取文件内容
            String content = raf.readUTF();
            System.out.println("内容: " + content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
