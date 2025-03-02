package com.kerwim.javaOperator;

/**
 * 逻辑运算符
 */
public class logicalOperator {

    public static void main(String[] args) {
        demo02();
    }

    /**
     *  && ||
     */
    public static void demo01(){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a>b||a<c);//true || true = true
    }

    /**
     * & |
     */
    public static void demo02(){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&a<c);//false & true = false
        System.out.println(a>b|a<c);//true | true = true
    }
}
