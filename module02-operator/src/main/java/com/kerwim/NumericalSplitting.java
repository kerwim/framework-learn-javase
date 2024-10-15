package com.kerwim;


import java.util.Scanner;

/**
 * 需求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
 */
public class NumericalSplitting {
    public static void main(String[] args) {
        //1.键盘录入一个三位数
        //导包 --- 创建对象 --- 接收数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        //123
        int number = sc.nextInt();

        //2.获取这个三位数的个位、十位、百位并打印出来
        //公式：
        //针对于任意的一个数而言
        //个位： 数字 % 10
        int ones = number % 10;
        //十位： 数字 / 10 % 10
        int tens = number / 10 % 10;
        //百位： 数字 / 100 % 10
        int hundreds = number / 100  % 10;
        //输出结果
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);
    }
}
