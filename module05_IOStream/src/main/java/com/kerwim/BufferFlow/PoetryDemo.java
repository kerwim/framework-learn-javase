package com.kerwim.BufferFlow;

import java.io.*;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 *
 */
public class PoetryDemo {

    public static void main(String[] args) throws IOException {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<>();

        // 创建流对象  源
        BufferedReader br = new BufferedReader(new FileReader("poetry.txt"));
        //目标
        BufferedWriter bw = new BufferedWriter(new FileWriter("poetry1.txt"));

        // 读取数据
        String line;
        while ((line = br.readLine())!=null) {
            // 解析文本
            if (line.isEmpty()) {
                continue;
            }
            String[] split = line.split(Pattern.quote("."));
            // 保存到集合
            lineMap.put(split[0], split[1]);
        }
        // 释放资源
        br.close();

        // 遍历map集合
        for (int i = 1; i <= lineMap.size(); i++) {
            String key = String.valueOf(i);
            // 获取map中文本
            String value = lineMap.get(key);
            // 写出拼接文本
            bw.write(key+"."+value);
            // 写出换行
            bw.newLine();
        }
        // 释放资源
        bw.close();
    }
}
