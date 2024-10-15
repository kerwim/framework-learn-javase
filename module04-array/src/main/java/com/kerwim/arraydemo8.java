package com.kerwim;


/**
 * 练习6：交换数据
 */
public class arraydemo8 {
    public static void main(String[] args) {
        //1.定义数组存储数据
        int[] arr = {1,2,3,4,5};
        //2.利用循环去交换数据
        for(int i = 0,j = arr.length - 1; i < j; i++,j--){
            //交换变量i和变量j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当循环结束之后，那么数组中的数据就实现了头尾交换
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}