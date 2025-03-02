package com.kerwim.printArray;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 打印数组
 */
public class printlnArray {

    public static void main(String[] args) {
        demo04();
    }

    /**
     * stream流打印 Java 数组
     */
    public static void demo01() {
        String [] cmowers = {"kerwim","牛马","一名纯Java牛马"};
        System.out.println(cmowers);
        Arrays.asList(cmowers).stream().forEach(s -> System.out.println(s));
        Stream.of(cmowers).forEach(System.out::println);
        Arrays.stream(cmowers).forEach(System.out::println);
    }

    /**
     * for循环打印 Java 数组
     */
    public static void demo02() {
        String [] cmowers = {"kerwim","牛马","一名纯Java牛马"};
        for(int i = 0; i < cmowers.length; i++){
            System.out.println(cmowers[i]);
        }

        for (String s : cmowers) {
            System.out.println(s);
        }
    }

    /**
     * Arrays.toString() 打印 Java 数组
     */
    public static void demo03() {
        String [] cmowers = {"kerwim","牛马","一名纯Java牛马"};
        System.out.println(Arrays.toString(cmowers));
    }

    /**
     * Arrays.deepToString() 打印多维数组
     */
    public static void demo04() {
        String[][] deepArray = new String[][] {{"kerwim", "牛马"}, {"一名纯Java牛马"}};
        System.out.println(Arrays.deepToString(deepArray));
    }
}
