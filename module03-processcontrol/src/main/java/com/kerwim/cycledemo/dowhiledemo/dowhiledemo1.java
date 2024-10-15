package com.kerwim.cycledemo.dowhiledemo;

/**
 * do...while 循环来打印从 1 到 5 的数字
 */
public class dowhiledemo1 {
    public static void main(String[] args) {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 5);
    }
}
