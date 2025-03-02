package com.kerwim.ObjAndClass;

/**
 * 反射获取类对象
 */
public class GetClassDemo {
    public static void main(String[] args) {
        Person p = new Person();
        Class<? extends Person> aClass = p.getClass();
        System.out.println(aClass.getName());
    }
}