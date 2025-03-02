package com.kerwim.flowControlStatement;

/**
 * for 循环
 */
public class forStatements {

    public static void main(String[] args) {
        demo03();
    }

    public static void demo01(){
        for (int i = 0; i < 5; i++) {
            System.out.println("我是第" + i + "次循环");
        }
    }

    public static void demo02(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0;j<= i;j++) {
                System.out.print("❤");
            }
            System.out.println();
        }
    }

    /**
     * for-each
     */
    public static void demo03(){
        String[] strs = {"kerwim", "一个Java开发社畜"};

        for (String str : strs) {
            System.out.println(str);
        }
    }

    /**
     * 死循环
     */
    public static void demo04(){
        for(;;){
            System.out.println("停不下来。。。。");
        }
    }



}
