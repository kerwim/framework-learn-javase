package com.kerwim.IOKnowledgeSystem;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 */
public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        // 创建一个 ByteArrayOutputStream 对象，用于写入数据到内存缓冲区中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // 定义一个字节数组用于存储要写入内存缓冲区中的数据
        byte[] info = "kerwim".getBytes();

        // 向内存缓冲区中写入数据，这里写入的是 info 数组中的所有字节
        bos.write(info, 0, info.length);

        // 将内存缓冲区中的数据转换为字节数组
        byte[] dest = bos.toByteArray();

        // 关闭 ByteArrayOutputStream 对象，释放资源
        bos.close();
    }
}
