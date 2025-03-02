package com.kerwim.splicingStrings;

/**
 * 拼接字符串
 */
public class splicingStrings {

    public static void main(String[] args) {
        demo01();
    }

    /**
     * 字符串拼接
     */
    public static void demo01() {
        String kerwim = "科尔沃";
        String niuma = " 牛马";
        System.out.println(kerwim + niuma);
    }

    /**
     * StringBuilder.append() 方法
     */
    public static void demo02() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            String kerwim = "科尔森";
            String niuma = "牛马";
            sb.append(kerwim);
            sb.append(niuma);
        }
        System.out.println(sb);
    }

    /**
     * concat() 方法
     */
    public static void demo03() {
        String kerwim = "科尔森";
        String niuma = "牛马";
        System.out.println(kerwim.concat(niuma));
    }

    /**
     * String.join() 方法
     */
    public static void demo04() {
        String kerwim = "科尔森";
        String niuma = "牛马";
        String cmower = String.join("", kerwim, niuma);
        System.out.println(cmower);
    }


    /**
     * split() 方法
     */
    public static void demo05() {
        String cmower = "kerwim，一名牛马程序员";
        if (cmower.contains("，")) {
            String [] parts = cmower.split("，");
            System.out.println("第一部分：" + parts[0] +" 第二部分：" + parts[1]);
        } else {
            throw new IllegalArgumentException("当前字符串没有包含逗号");
        }
    }


//    public static void demo01() {}
}
