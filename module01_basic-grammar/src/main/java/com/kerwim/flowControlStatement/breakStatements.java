package com.kerwim.flowControlStatement;

/**
 * break 示例
 */
public class breakStatements {

    public static void main(String[] args) {
        demo01();
    }

    /**
     * 用在 for 循环中的示例
     */
    public static void demo01() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    /**
     * 用在嵌套循环中的示例
     */
    public static void demo02() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    /**
     * 用在 while 循环中的示例
     */
    public static void demo03() {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }

    /**
     * 用在 do-while 循环中的示例
     */
    public static void demo04() {
        int j = 1;
        do {
            if (j == 5) {
                j++;
                break;
            }
            System.out.println(j);
            j++;
        } while (j <= 10);
    }

    /**
     * 用在 switch-case 中的示例
     */
    public static void demo05() {
        int age = 30;
        switch (age) {
            case 20 :
                System.out.println("上学");
                break;
            case 24 :
                System.out.println("牛马");
                break;
            case 30 :
                System.out.println("纯牛马");
                break;
            default:
                System.out.println("未知");
                break; // 可省略
        }
    }
}
