package com.kerwim.Statickeyword;

public class StaticMethodStudent {
    String name;
    int age;
    static String school = "玉林师范学院";

    public StaticMethodStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    static void change() {
        school = "广西大学";
    }
    
    void out() {
        System.out.println(name + " " + age + " " + school);
    }

    public static void main(String[] args) {
        StaticMethodStudent.change();
        
        StaticMethodStudent s1 = new StaticMethodStudent("kerwim", 18);
        StaticMethodStudent s2 = new StaticMethodStudent("kerwim", 16);
        
        s1.out();
        s2.out();
    }
}