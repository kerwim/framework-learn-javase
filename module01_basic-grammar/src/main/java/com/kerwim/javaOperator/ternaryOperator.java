package com.kerwim.javaOperator;

/**
 * 三元运算符
 */
public class ternaryOperator {

    public static void main(String[] args) {
        demo01();
    }

    public static void demo01(){
        int a=2;
        int b=5;
        int min=(a<b)?a:b;
        System.out.println(min);
    }
}
