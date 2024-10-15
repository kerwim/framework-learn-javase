package com.kerwim;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //扩展赋值运算符
        int a = 10;
        int b = 20;
        //把左边和右边相加，再把最终的结果赋值给左边，对右边没有任何影响
        a += b;
        // 相当于 a = a + b;
        //30
        System.out.println(a);
        //20
        System.out.println(b);
    }
}