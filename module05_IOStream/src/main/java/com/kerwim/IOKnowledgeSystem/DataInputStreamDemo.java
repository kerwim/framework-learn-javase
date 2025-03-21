package com.kerwim.IOKnowledgeSystem;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 */
public class DataInputStreamDemo {

    public static void main(String[] args) throws IOException {
        // 创建一个 DataInputStream 对象，用于从文件中读取数据
        DataInputStream dis = new DataInputStream(new FileInputStream("das.txt"));

        // 读取一个字节，将其转换为 byte 类型
        byte b = dis.readByte();

        // 读取两个字节，将其转换为 short 类型
        short s = dis.readShort();

        // 读取四个字节，将其转换为 int 类型
        int i = dis.readInt();

        // 读取八个字节，将其转换为 long 类型
        long l = dis.readLong();

        // 读取四个字节，将其转换为 float 类型
        float f = dis.readFloat();

        // 读取八个字节，将其转换为 double 类型
        double d = dis.readDouble();

        // 读取一个字节，将其转换为 boolean 类型
        boolean bb = dis.readBoolean();

        // 读取两个字节，将其转换为 char 类型
        char ch = dis.readChar();

        // 关闭 DataInputStream，释放资源
        dis.close();
    }
}
