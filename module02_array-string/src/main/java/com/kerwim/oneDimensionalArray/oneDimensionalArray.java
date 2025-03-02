package com.kerwim.oneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 数组(一维数组)
 */
public class oneDimensionalArray {


    public static void main(String[] args) {
        demo10();
    }

    public static void demo01() {
        int anOtherArray[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < anOtherArray.length; i++) {
            System.out.println(anOtherArray[i]);
        }
    }

    public static void demo02() {
        int anOtherArray[] = new int[]{1, 2, 3, 4, 5};
        for (int element : anOtherArray) {
            System.out.println(element);
        }
    }

    public static void demo03() {
        VarargsDemo demo = new VarargsDemo();
        String[] anArray = new String[]{"kerwim", "一名Java牛马"};
        demo.varargsMethod(anArray);

        demo.varargsMethod("kerwim", "一名Java牛马");
    }


    /**
     * 数组转集合
     */
    public static void demo04() {
        int[] anArray = new int[]{1, 2, 3, 4, 5};

        List<Integer> aList = new ArrayList<>();
        for (int element : anArray) {
            aList.add(element);
        }
    }

    /**
     * 数组转集合
     */
    public static void demo05() {
        int[] anArray = new int[]{1, 2, 3, 4, 5};
        List<Integer> aList = Arrays.stream(anArray).boxed().collect(Collectors.toList());
        List<Integer> aList1 = Arrays.asList(1, 2, 3, 4, 5);
    }

    /**
     * 数组排序
     */
    public static void demo06() {
        int[] anArray = new int[]{5, 2, 1, 4, 8};
        Arrays.sort(anArray);
    }

    /**
     * 数组排序
     */
    public static void demo07() {
        String[] yetAnotherArray = new String[]{"A", "E", "Z", "B", "C"};
        Arrays.sort(yetAnotherArray, 1, 3,
                Comparator.comparing(String::toString).reversed());
    }

    /**
     * 查找元素
     */
    public static void demo08() {
        int[] anArray = new int[]{5, 2, 1, 4, 8};
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == 4) {
                System.out.println("找到了 " + i);
                break;
            }
        }
    }

    /**
     * 查找元素二分查找
     */
    public static void demo09() {
        int[] anArray = new int[]{1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(anArray, 4);
    }

    /**
     * 数组复制
     */
    public static void demo10() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // 创建一个新数组，长度为两个数组长度之和
        int[] mergedArray = new int[array1.length + array2.length];

        // 复制第一个数组到新数组
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.out.println(Arrays.toString(mergedArray));

        // 复制第二个数组到新数组
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        System.out.println(Arrays.toString(mergedArray));
    }

    /**
     * 循环数组复制
     */
    public static void demo11() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // 创建一个新数组，长度为两个数组长度之和
        int[] mergedArray = new int[array1.length + array2.length];

        // 复制第一个数组到新数组
        int index = 0;
        for (int element : array1) {
            mergedArray[index++] = element;
        }

        // 复制第二个数组到新数组
        for (int element : array2) {
            mergedArray[index++] = element;
        }
    }

}
