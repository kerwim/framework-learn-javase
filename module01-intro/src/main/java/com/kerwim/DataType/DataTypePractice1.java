package com.kerwim.DataType;

/**
 * 数据类型练习1
 * 需求：定义5个变量记录老师的信息并打印
 */
public class DataTypePractice1 {
    public static void main(String[] args){
        //1.定义字符串类型的变量记录老师的姓名
        String name = "玉林师院金城武";
        //2.定义整数类型的变量记录老师的年龄
        int age = 18;
        //3.定义字符类型的变量记录老师的性别
        char gender = '男';
        //4.定义小数类型的变量记录老师的身高
        double height = 176.1;
        //5.定义布尔类型的变量记录老师的婚姻状况
        boolean flag = true;

        //输出5个变量的值
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(flag);

    }
}
