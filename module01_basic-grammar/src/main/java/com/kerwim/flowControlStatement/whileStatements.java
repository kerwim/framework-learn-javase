package com.kerwim.flowControlStatement;

/**
 * while 循环
 */
public class whileStatements {

    public static void main(String[] args) {
        demo01();
    }

    public static void demo01(){
        int i = 0;
        while (true) {
            System.out.println("kerwim");
            i++;
            if (i == 5) {
                break;
            }
        }
    }

    public static void demo02(){
        while (true) {
            System.out.println("停不下来。。。。");
        }
    }


}
