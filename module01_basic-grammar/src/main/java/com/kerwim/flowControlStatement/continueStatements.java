package com.kerwim.flowControlStatement;

/**
 * continue 使用示例
 */
public class continueStatements {

    public static void main(String[] args) {
        demo04();
    }

    /**
     * 用在 for 循环中的示例
     */
    public static void demo01() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // 使用 continue 关键字
                continue;// 5 将会被跳过
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
                    // 使用 continue 关键字
                    continue;// 2 2 将会被跳过
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
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    /**
     * 用在 do-while 循环中的示例
     */
    public static void demo04() {
        int i=1;
        do{
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }

}
