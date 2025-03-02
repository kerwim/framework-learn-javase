package com.kerwim.flowControlStatement;

/**
 * if else 语句
 */
public class ifElseStatements {

    public static void main(String[] args) {
        demo05();
    }

    /**
     * if  语句
     */
    public static void demo01(){
        int age = 20;
        if (age < 30) {
            System.out.println("青春年华");
        }
    }

    /**
     * if else 语句
     */
    public static void demo02(){
        int age = 31;
        if (age < 30) {
            System.out.println("青春年华");
        } else {
            System.out.println("而立之年");
        }
    }

    /**
     * if else 语句
     */
    public static void demo03(){
        int year = 2020;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("闰年");
        } else {
            System.out.println("普通年份");
        }
    }

    /**
     * if else else if else 语句
     */
    public static void demo04(){
        int age = 31;
        if (age < 30) {
            System.out.println("青春年华");
        } else if (age >= 30 && age < 40 ) {
            System.out.println("而立之年");
        } else if (age >= 40 && age < 50 ) {
            System.out.println("不惑之年");
        } else {
            System.out.println("知天命");
        }
    }

    /**
     * 嵌套 if 语句
     */
    public static void demo05(){
        int age = 20;
        boolean isGirl = true;
        if (age >= 20) {
            if (isGirl) {
                System.out.println("女生法定结婚年龄");
            }
        }
    }
}
