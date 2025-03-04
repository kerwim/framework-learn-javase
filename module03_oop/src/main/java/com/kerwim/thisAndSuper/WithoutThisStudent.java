package com.kerwim.thisAndSuper;

public class WithoutThisStudent {
    String name;
    int age;

    WithoutThisStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void out() {
        System.out.println(name+" " + age);
    }

    public static void main(String[] args) {
        WithoutThisStudent s1 = new WithoutThisStudent("kerwim", 18);
        WithoutThisStudent s2 = new WithoutThisStudent("kerwim", 16);

        s1.out();
        s2.out();
    }
}