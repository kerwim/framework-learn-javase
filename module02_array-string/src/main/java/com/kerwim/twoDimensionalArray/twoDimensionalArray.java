package com.kerwim.twoDimensionalArray;

/**
 * 二维数组
 */
public class twoDimensionalArray {

    public static void main(String[] args) {
        demo01();
    }

    public static void demo01() {
        int[][] oddNumbers = { {1, 3, 5, 7}, {9, 11, 13, 15} };

        System.out.println(oddNumbers[0][0]);
        // 1
    }

    public static void demo02() {
        int[][] oddNumbers = { {1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23} };

        System.out.println(oddNumbers[2][2]);
        // 21
    }

    public static void demo03() {
        int[][] oddNumbers = { {1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23} };

        for(int i = 0; i < oddNumbers.length; i++){
            for(int j = 0; j < oddNumbers[i].length; j++){
                System.out.println(oddNumbers[i][j]);
            }
        }
        // 1
        // 3
        // 5
        // 7
        // 9
        // 11
        // 13
        // 15
        // 17
        // 19
        // 21
        // 23
    }

    public static void demo04() {}
}
