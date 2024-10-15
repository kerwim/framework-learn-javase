package com.kerwim;

/**
 * 练习3：变化数据
 */
public class arraydemo5 {
    public static void main(String[] args) {
        //分析：
        //1.定义一个数组，存1,2,3,4,5,6,7,8,9,10
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素
            //3.对每一个元素进行判断
            if(arr[i] % 2 == 0){
                //偶数 变成二分之一
                arr[i] = arr[i] / 2;
            }else{
                //奇数 扩大两倍
                arr[i] = arr[i] * 2;
            }
        }

        //遍历数组
        //一个循环尽量只做一件事情。
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}