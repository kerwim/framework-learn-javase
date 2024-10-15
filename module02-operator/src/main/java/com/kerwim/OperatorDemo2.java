package com.kerwim;

/**
 * 赋值运算符
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        //1.最为简单的赋值运算符用法
        //就是把10赋值给变量a
        int a = 10;
        System.out.println(a);

        //2.如果等号右边需要进行计算。
        int b = 20;
        //先计算等号右边的，把计算的结果赋值给左边的变量
        int c = a + b;
        System.out.println(c);

        //3.特殊的用法
        //先计算等号右边的，把计算的结果赋值给左边的变量
        a = a + 10;
        //20
        System.out.println(a);
    }
}