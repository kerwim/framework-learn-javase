package com.kerwim;

public class arraydemo2 {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,5,5,5,5};
        //用索引来访问数组中的元素
        System.out.println(arr[1]);
        //ArrayIndexOutOfBoundsException
        System.out.println(arr[10]);

    }
}