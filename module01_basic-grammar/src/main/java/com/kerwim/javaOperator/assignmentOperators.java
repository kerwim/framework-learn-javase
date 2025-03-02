package com.kerwim.javaOperator;

/**
 * 赋值运算符
 */
public class assignmentOperators {

    public static void main(String[] args) {
        demo03();
    }

    /**
     * 赋值运算符
     */
    public static void demo01(){
        int a=10;
        int b=20;
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * 赋值运算符 强转
     */
    public static void demo02(){
        short a = 10;
        short b = 10;
        //a+=b;//a=a+b internally so fine
        a = (short)(a + b);
        System.out.println(a);
    }

    /**
     * 赋值运算符 越界
     */
    public static void demo03(){
        long a = Integer.MAX_VALUE - 1;
        long b = 10000;
        long c = a * b;
        System.out.println(c); // 21474836460000
    }
}
