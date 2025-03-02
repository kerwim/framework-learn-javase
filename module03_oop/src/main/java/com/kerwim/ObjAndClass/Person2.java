package com.kerwim.ObjAndClass;

/**
 * 通过方法初始化
 */
public class Person2 {
    private String name;
    private int age;
    private int sex;

    public void initialize(String n, int a, int s) {
        name = n;
        age = a;
        sex = s;
    }

    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.initialize("kerwim",18,1);

        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.sex);
    }
}
