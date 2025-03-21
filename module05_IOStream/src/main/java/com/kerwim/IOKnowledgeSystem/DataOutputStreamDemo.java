package com.kerwim.IOKnowledgeSystem;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class DataOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        // 创建一个 DataOutputStream 对象，用于将数据写入到文件中
        DataOutputStream das = new DataOutputStream(new FileOutputStream("das.txt"));

        // 将一个 byte 类型的数据写入到文件中
        das.writeByte(10);

        // 将一个 short 类型的数据写入到文件中
        das.writeShort(100);

        // 将一个 int 类型的数据写入到文件中
        das.writeInt(1000);

        // 将一个 long 类型的数据写入到文件中
        das.writeLong(10000L);

        // 将一个 float 类型的数据写入到文件中
        das.writeFloat(12.34F);

        // 将一个 double 类型的数据写入到文件中
        das.writeDouble(12.56);

        // 将一个 boolean 类型的数据写入到文件中
        das.writeBoolean(true);

        // 将一个 char 类型的数据写入到文件中
        das.writeChar('A');

        // 关闭 DataOutputStream，释放资源
        das.close();
    }
}
