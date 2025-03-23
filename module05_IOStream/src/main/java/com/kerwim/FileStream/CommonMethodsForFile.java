package com.kerwim.FileStream;

import java.io.File;
import java.io.IOException;

/**
 * File常用方法
 */
public class CommonMethodsForFile {

    public static void main(String[] args) throws IOException {
        File f = new File("/Users/mac/Documents/CompanyCode2/logfile.log");
        System.out.println("文件绝对路径:"+f.getAbsolutePath());
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");

        File f2 = new File("/Users/mac/Documents/CompanyCode2/");
        System.out.println("目录绝对路径:"+f2.getAbsolutePath());
        System.out.println("目录构造路径:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录长度:"+f2.length());

        // 绝对路径示例
        File absoluteFile = new File("/Users/mac/Documents/CompanyCode2/logfile.log");
        System.out.println("绝对路径：" + absoluteFile.getAbsolutePath());

        // 相对路径示例
        File relativeFile = new File("CompanyCode2/logfile.log");
        System.out.println("相对路径：" + relativeFile.getPath());


        File file = new File("/Users/mac/Documents/CompanyCode2/logfile.log");

        // 判断文件或目录是否存在
        if (file.exists()) {
            System.out.println("文件或目录存在");
        } else {
            System.out.println("文件或目录不存在");
        }

        // 判断是否是目录
        if (file.isDirectory()) {
            System.out.println("是目录");
        } else {
            System.out.println("不是目录");
        }

        // 判断是否是文件
        if (file.isFile()) {
            System.out.println("是文件");
        } else {
            System.out.println("不是文件");
        }



        // 创建文件
        File file2 = new File("/Users/mac/Documents/CompanyCode2/example/test.txt");
        if (file2.createNewFile()) {
            System.out.println("创建文件成功：" + file2.getAbsolutePath());
        } else {
            System.out.println("创建文件失败：" + file2.getAbsolutePath());
        }

        // 删除文件
        if (file2.delete()) {
            System.out.println("删除文件成功：" + file2.getAbsolutePath());
        } else {
            System.out.println("删除文件失败：" + file2.getAbsolutePath());
        }

        // 创建多级目录
        File directory = new File("/Users/mac/Documents/CompanyCode2/example/subdir1/subdir2");
        if (directory.mkdirs()) {
            System.out.println("创建目录成功：" + directory.getAbsolutePath());
        } else {
            System.out.println("创建目录失败：" + directory.getAbsolutePath());
        }


        File directory2 = new File("/Users/mac/Documents/LearnCode/framework-learn-javase");

        // 列出目录下的文件名
        String[] files = directory2.list();
        System.out.println("目录下的文件名：");
        for (String file3 : files) {
            System.out.println(file3);
        }

        // 列出目录下的文件和子目录
        File[] filesAndDirs = directory2.listFiles();
        System.out.println("目录下的文件和子目录：");
        for (File fileOrDir : filesAndDirs) {
            if (fileOrDir.isFile()) {
                System.out.println("文件：" + fileOrDir.getName());
            } else if (fileOrDir.isDirectory()) {
                System.out.println("目录：" + fileOrDir.getName());
            }
        }



    }

}
