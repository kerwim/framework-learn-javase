package com.kerwim.cycledemo.fordemo;

/**
 * ##### for循环练习-求偶数和
 */
public class fordemo4 {

    public static void main(String[] args) {
        //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;
        //对1-100的数据求和与1-5的数据求和几乎完全一样，仅仅是结束条件不同
        for(int i=1; i<=100; i++) {
            //对1-100的偶数求和，需要对求和操作添加限制条件，判断是否是偶数
            if(i%2 == 0) {
                //sum += i；
                sum = sum + i;
            }
        }
        //当循环执行完毕时，将最终数据打印出来
        System.out.println("1-100之间的偶数和是：" + sum);
    }
}
