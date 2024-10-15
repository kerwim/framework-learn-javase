package com.kerwim.cycledemo.fordemo;

/**
 * for循环
 */
public class fordemo1 {

    public static void main(String[] args) {
        //1.确定循环的开始条件
        //2.确定循环的结束条件
        //3.确定要重复执行的代码

        //需求：打印5次HelloWorld
        //开始条件：1
        //结束条件：5
        //重复代码：打印语句
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }
    }
}
