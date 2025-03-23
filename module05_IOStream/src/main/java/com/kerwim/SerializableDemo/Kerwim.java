package com.kerwim.SerializableDemo;

import java.io.Serializable;

public class Kerwim implements Serializable {

    private static final long serialVersionUID = -2095916884810199532L;

    private String name;
    private int age;

    public static String pre = " 灭绝";
    transient String meizi = "师太";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kerwim{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pre='" + pre + '\'' +
                ", meizi='" + meizi + '\'' +
                '}';
    }
}