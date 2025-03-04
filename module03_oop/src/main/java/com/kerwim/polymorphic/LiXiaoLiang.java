package com.kerwim.polymorphic;

public class LiXiaoLiang extends LiLiang {
    public void write() {
        System.out.println("记住仇恨，表明我们要奋发图强的心智");
    }

    public void eat() {
        System.out.println("我不喜欢读书，我就喜欢吃");
    }

    public static void main(String[] args) {
        LiLiang[] liliangs = { new LiLiang(), new LiXiaoLiang() };

        // liliangs[1]能够向下转型
        ((LiXiaoLiang) liliangs[1]).write();
        // liliangs[0]不能向下转型
        ((LiXiaoLiang) liliangs[0]).write();
    }
}

class LiLiang {
    public void write() {
        System.out.println("勿忘国耻");
    }

    public void read() {
        System.out.println("每周读一本好书");
    }
}