package com.kerwim.dataTypeConversion;

/**
 * 自动类型转换
 */
public class autoTypeConversion {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1(){
        int intValue = 5;
        double doubleValue = 2.5;

        // 自动类型转换：intValue 被转换为 double 类型
        double result = intValue * doubleValue;
        System.out.println("结果: " + result); // 输出：结果: 12.5
    }

    public static void demo2(){
        float price1 = 10.9f; // 定义牙膏的价格，单精度浮点型float
        double price2 = 5.8; // 定义面巾纸的价格，双精度浮点型double
        int num1 = 2; // 定义牙膏的数量，整型 int
        int num2 = 4; // 定义面巾纸的数量
        double res = price1 * num1 + price2 * num2; // 计算总价
        System.out.println("一共付给收银员" + res + "元"); // 输出总价
    }
}
