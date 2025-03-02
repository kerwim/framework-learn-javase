package com.kerwim.stringSourceCode;

/**
 * String IndexOf
 */
public class stringIndexOf {

    public static void main(String[] args) {
        demo01();
    }

    /**
     * indexOf() 方法
     */
    public static void demo01() {
        String str = "Hello, world!";
        int index = str.indexOf("world");  // 查找 "world" 子字符串在 str 中第一次出现的位置
        System.out.println(index);        // 输出 7
    }

    public static void demo02() {
        String str = "Hello, world!";
        int index = str.indexOf(",");     // 查找逗号在 str 中第一次出现的位置
        System.out.println(index);        // 输出 5
    }
    public static void demo03() {
        String str = "Hello, world!";
        int index = str.indexOf("l", 3);  // 从索引为3的位置开始查找 "l" 子字符串在 str 中第一次出现的位置
        System.out.println(index);        // 输出 3
    }

    public static void demo04() {
        String str = "Hello, world!";
        int index1 = str.indexOf("o");    // 查找 "o" 子字符串在 str 中第一次出现的位置
        int index2 = str.indexOf("o", 5); // 从索引为5的位置开始查找 "o" 子字符串在 str 中第一次出现的位置
        System.out.println(index1);       // 输出 4
        System.out.println(index2);       // 输出 8
    }
//    public static void demo01() {}
}
