package com.kerwim.IOKnowledgeSystem;

import java.io.File;
import java.io.IOException;

/**
 *
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {
        // 创建文件
        File file = new File("test.txt");
        if (file.createNewFile()) {
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件已存在");
        }

        // 删除文件
        if (file.delete()) {
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件删除失败");
        }

        // 重命名文件
        File oldFile = new File("old.txt");
        File newFile = new File("new.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("文件重命名成功");
        } else {
            System.out.println("文件重命名失败");
        }
    }
}
