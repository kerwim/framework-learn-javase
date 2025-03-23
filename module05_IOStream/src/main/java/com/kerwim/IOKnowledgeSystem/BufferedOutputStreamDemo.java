package com.kerwim.IOKnowledgeSystem;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class BufferedOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        // 创建一个 BufferedOutputStream 对象，用于将数据写入到文件中
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data.txt"));

        // 创建一个字节数组，作为缓存区
        byte[] buffer = new byte[1024];

        // 将数据写入到文件中
        String data = "7788778877887788!";
        buffer = data.getBytes();
        bos.write(buffer);

        // 刷新缓存区，将缓存区中的数据写入到文件中
        bos.flush();

        // 关闭 BufferedOutputStream，释放资源
        bos.close();
    }

}
