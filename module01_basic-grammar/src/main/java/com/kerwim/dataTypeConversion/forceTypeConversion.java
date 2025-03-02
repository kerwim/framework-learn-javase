package com.kerwim.dataTypeConversion;

/**
 * 强制类型转换
 */
public class forceTypeConversion {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1(){
        double doubleValue = 42.8;
        // 强制类型转换：将 double 类型转换为 int 类型
        int intValue = (int) doubleValue;
        System.out.println("整数值: " + intValue); // 输出：整数值: 42
    }

    public static void demo2(){
        float price1 = 10.9f;
        double price2 = 5.8;
        int num1 = 2;
        int num2 = 4;
        int res2 = (int) (price1 * num1 + price2 * num2);
        System.out.println("一共付给收银员" + res2 + "元"); //一共付给收银员44元
    }
}
