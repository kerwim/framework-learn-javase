package com.kerwim.comment;

/**
 * 注释
 */
public class commentTest {

    public static void main(String[] args) {

    }

    /**
     * 单行注释
     */
    public void method() {
        // age 用于表示年龄
        int age = 18;
    }

    /**
     * 多行注释
     */
    public void method2() {
        /*
        age 用于表示年龄
        name 用于表示姓名
         */
        int age = 18;
        String name = "kerwim";
    }

    /**
     * 文档注释  这就是文档注释
     * @param name 用于表示姓名
     * @param age 用于表示年龄
     */
}
