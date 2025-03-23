package com.kerwim.ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        demo9();
    }

    public static void demo1() throws FileNotFoundException {
        String fileName = "example.txt";
        FileOutputStream fos = new FileOutputStream(fileName);

        File file = new File("example.txt");
        FileOutputStream fos2 = new FileOutputStream(file);

        FileOutputStream fos3 = null;
        try {
            fos3 = new FileOutputStream("example.txt");
            fos3.write("kerwim".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void demo2() throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos4 = new FileOutputStream("fos.txt");
        // 写出数据
        fos4.write(97); // 第1个字节
        fos4.write(98); // 第2个字节
        fos4.write(99); // 第3个字节
        // 关闭资源
        fos4.close();
    }

    public static void demo3() throws IOException {
        //
        FileOutputStream fos5 = null;
        try {
            fos5 = new FileOutputStream("example.txt");

            fos5.write(120);
            fos5.write('x');
            fos5.write(0x12345678);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos5 != null) {
                try {
                    fos5.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void demo4() throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos6 = new FileOutputStream("fos.txt");
        // 字符串转换为字节数组
        byte[] b = "kerwim is good".getBytes();
        // 写入字节数组数据
        fos6.write(b);
        // 关闭资源
        fos6.close();
    }

    public static void demo5() throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 字符串转换为字节数组
        byte[] b = "abcde".getBytes();
        // 从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b,2,2);
        // 关闭资源
        fos.close();
    }

    public static void demo6() throws IOException {
        String fileName = "example.txt";
        boolean append = true;
        FileOutputStream fos = new FileOutputStream(fileName, append);
    }

    public static void demo7() throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        // 字符串转换为字节数组
        byte[] b = "abcde".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b);
        // 关闭资源
        fos.close();
    }

    public static void demo8() throws IOException {
        String filename = "example.txt";
        FileOutputStream fos = new FileOutputStream(filename, true);  // 追加模式
        String content = "kerwim is niuma\r\n";  // 使用回车符和换行符的组合
        fos.write(content.getBytes());
        fos.close();
    }

    public static void demo9() throws IOException {
        String filename = "example.txt";
        FileOutputStream fos = new FileOutputStream(filename, true);  // 追加模式
        String content = "kerwim is good\n";  // 只使用换行符
        fos.write(content.getBytes());
        fos.close();
    }

}
