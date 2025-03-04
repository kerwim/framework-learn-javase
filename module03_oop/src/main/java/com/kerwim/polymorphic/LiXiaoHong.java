package com.kerwim.polymorphic;

//子类继承父类
public class LiXiaoHong extends LiHong {
    public void write() { // 子类重写父类方法
        System.out.println("记住仇恨，表明我们要奋发图强的心智");
    }

    public void eat() {
        System.out.println("我不喜欢读书，我就喜欢吃");
    }

    public static void main(String[] args) {
        // 父类引用指向子类对象
        LiHong[] lihongs = { new LiHong(), new LiXiaoHong() };

        for (LiHong lihong : lihongs) {
            // 对象是李红的时候输出：勿忘国耻
            // 对象是李小红的时候输出：记住仇恨，表明我们要奋发图强的心智
            lihong.write();
        }
    }
}

class LiHong {
    public void write() {
        System.out.println("勿忘国耻");
    }

    public void read() {
        System.out.println("每周读一本好书");
    }
}