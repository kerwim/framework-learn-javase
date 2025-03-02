package com.kerwim.ObjAndClass;

/**
 * 通过构造方法初始化
 */
public class Person3 {
    private String name;
    private int age;
    private int sex;

    public Person3(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
        Person3 person3 = new Person3("kerwim", 18, 1);

        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.sex);
    }
}
