package com.kerwim.javaOperator;

/**
 * 关系运算符
 */
public class relationalOperator {

    public static void main(String[] args) {
        demo01();
    }

    public static void demo01(){
        int a = 10, b = 20;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
    }
}
