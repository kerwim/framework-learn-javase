package com.kerwim.CharacterStream;

import java.io.*;

/**
 *
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        demo16();
    }

    public static void demo1() throws IOException {
        //FileInputStream为操作文件的字符输入流
        FileInputStream inputStream = new FileInputStream("a.txt");//内容为“俄乌战争大概能打几个月？俄罗斯会不会打核武器？”

        int len;
        while ((len=inputStream.read())!=-1){
            System.out.print((char)len);
        }
    }

    public static void demo2() throws IOException {
        try (FileInputStream inputStream = new FileInputStream("a.txt")) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, len));
            }
        }
    }

    public static void demo3() throws IOException {
        // 使用File对象创建流对象
        File file = new File("a.txt");
        FileReader fr = new FileReader(file);
    }

    public static void demo4() throws IOException {
        // 使用文件名称创建流对象
        FileReader fr2 = new FileReader("b.txt");
    }

    public static void demo5() throws IOException {
        // 使用文件名称创建流对象
        FileReader fr = new FileReader("abc.txt");
        // 定义变量，保存数据
        int b;
        // 循环读取
        while ((b = fr.read())!=-1) {
            System.out.println((char)b);
        }
        // 关闭资源
        fr.close();
    }

    public static void demo6() throws IOException {
        File textFile = new File("fos.txt");
        // 给一个 FileReader 的示例
        // try-with-resources FileReader
        try(FileReader reader = new FileReader(textFile);) {
            // read(char[] cbuf)
            char[] buffer = new char[1024];
            int len;
            while ((len = reader.read(buffer, 0, buffer.length)) != -1) {
                System.out.print(new String(buffer, 0, len));
            }
        }
    }

    public static void demo7() throws IOException {
        // 第一种：使用File对象创建流对象
        File file = new File("c.txt");
        FileWriter fw = new FileWriter(file);

        // 第二种：使用文件名称创建流对象
        //FileWriter fw2 = new FileWriter("b.txt");
    }

    public static void demo8() throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter("output.txt");
            fw.write(72); // 写入字符'H'的ASCII码
            fw.write(101); // 写入字符'e'的ASCII码
            fw.write(108); // 写入字符'l'的ASCII码
            fw.write(108); // 写入字符'l'的ASCII码
            fw.write(111); // 写入字符'o'的ASCII码
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void demo9() throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter("output.txt");
            char[] chars = {'H', 'e', 'l', 'l', 'o'};
            fw.write(chars); // 将字符数组写入文件
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void demo10() throws IOException {
        FileWriter fw = null;
        fw = new FileWriter("output.txt");
        char[] chars = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        fw.write(chars, 0, 10); // 将字符数组的前 5 个字符写入文件
        fw.close();
    }

    public static void demo11() throws IOException {
        FileWriter fw = null;
        fw = new FileWriter("output.txt");
        String str = "kerwim";
        fw.write(str); // 将字符串写入文件
        fw.close();
    }

    public static void demo12() throws IOException {
        String str = "kerwim 真的 niuma！";
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(str, 0, 5); // 将字符串的前 5 个字符写入文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void demo13() throws IOException {
        //源   也就是输入流【读取流】 读取a.txt文件

        //必须要存在a.txt文件，否则报FileNotFoundException异常
        FileReader fr=new FileReader("abc.txt");
        //目的地  也就是输出流
        //系统会自动创建b.txt，因为它是输出流！
        FileWriter fw=new FileWriter("b.txt");
        int len;
        while((len=fr.read())!=-1){
            fw.write(len);
        }
        //注意这里是没有使用close关闭流，开发中不能这样做，但是为了更好的体会flush的作用
    }


    public static void demo14() throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");
        // 写出数据，通过flush
        fw.write('刷'); // 写出第1个字符
        fw.flush();
        fw.write('新'); // 继续写出第2个字符，写出成功
        fw.flush();

        // 写出数据，然后close
        fw.write('关'); // 写出第1个字符
        fw.close();
        fw.write('闭'); // 继续写出第2个字符,【报错】java.io.IOException: Stream closed
        fw.close();
    }


    public static void demo15() throws IOException {
        // 使用文件名称创建流对象，可以续写数据
        FileWriter fw = new FileWriter("fw.txt",true);
        // 写出字符串
        fw.write("kerwim");
        // 写出换行
        fw.write("\r\n");
        // 写出字符串
        fw.write("是傻 X");
        // 关闭资源
        fw.close();
    }

    public static void demo16() throws IOException {
        // 声明变量
        FileWriter fw = null;
        try {
            //创建流对象
            fw = new FileWriter("fw.txt");
            // 写出数据
            fw.write("kerwim 真的帅"); //哥敢摸si
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
