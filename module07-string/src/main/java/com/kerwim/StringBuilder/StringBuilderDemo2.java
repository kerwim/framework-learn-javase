package com.kerwim.StringBuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();
        //2.添加字符串
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        //aaabbbcccddd
        System.out.println(sb);
        //3.再把StringBuilder变回字符串
        String str = sb.toString();
        //aaabbbcccddd
        System.out.println(str);
    }
}