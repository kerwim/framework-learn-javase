package com.kerwim.javaOperator;

/**
 * arithmetic operator
 */
public class arithmeticOperator {

    public static void main(String[] args) {
        demo01();
    }

    /**
     * 整数类型加减乘除取模
     */
    public static void demo01(){
        int a = 10;
        int b = 5;

        System.out.println(a + b);//15
        System.out.println(a - b);//5
        System.out.println(a * b);//50
        System.out.println(a / b);//2
        System.out.println(a % b);//0

        b = 3;
        System.out.println(a + b);//13
        System.out.println(a - b);//7
        System.out.println(a * b);//30
        System.out.println(a / b);//3
        System.out.println(a % b);//1
    }

    /**
     * 浮点数类型加减乘除取模
     */
    public static void demo02(){
        int a = 10;
        float c = 3.0f;
        double d = 3.0;
        System.out.println(a / c); // 3.3333333
        System.out.println(a / d); // 3.3333333333333335
        System.out.println(a % c); // 1.0
        System.out.println(a % d); // 1.0

        System.out.println(10.0 / 0.0); // Infinity
        System.out.println(0.0 / 0.0); // NaN
    }

    /**
     * 自增自减
     */
    public static void demo03(){
        int x = 10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
    }

    /**
     * 自增自减
     */
    public static void demo04(){
        int x = 10;
        int y = ++x;
        System.out.println(y + " " + x);// 11 11

        x = 10;
        y = x++;
        System.out.println(y + " " + x);// 10 11
    }
}
