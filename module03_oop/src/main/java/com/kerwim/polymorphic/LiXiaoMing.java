package com.kerwim.polymorphic;

public class LiXiaoMing extends LiMing {
    private int age = 3;
    public LiXiaoMing(int age) {
        this.age = age;
        System.out.println("李小明的年龄：" + this.age);
    }

    public void write() { // 子类覆盖父类方法
        System.out.println("我小明上幼儿园的年龄是：" + this.age);
    }

    public static void main(String[] args) {
        new LiXiaoMing(4);
//      上幼儿园之前
//      我小明上幼儿园的年龄是：0
//      上幼儿园之后
//      李小明的年龄：4
    }
}

class LiMing {
    LiMing () {
        System.out.println("上幼儿园之前");
        write();
        System.out.println("上幼儿园之后");
    }
    public void write() {
        System.out.println("老子上幼儿园的年龄是3岁半");
    }
}