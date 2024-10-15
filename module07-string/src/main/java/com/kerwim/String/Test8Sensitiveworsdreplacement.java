package com.kerwim.String;

import java.util.Scanner;

public class Test8Sensitiveworsdreplacement {
    public static void main(String[] args) {
        //实际开发中，敏感词会有很多很多
        //1.先键盘录入要说的话
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要说的话");
        //输入 瞎子你玩什么啊，TMD,GDX,ctmd,ZZ
        String talk = sc.next();
        //2.定义一个数组用来存多个敏感词
        String[] arr = {"TMD","GDX","ctmd","ZZ","lj","FW","nt"};
        //3.把说的话中所有的敏感词都替换为***
        for (int i = 0; i < arr.length; i++) {
            //i 索引
            //arr[i] 元素 --- 敏感词
            talk = talk.replace(arr[i],"***");
        }
        //4.打印结果
        System.out.println(talk);
    }
}