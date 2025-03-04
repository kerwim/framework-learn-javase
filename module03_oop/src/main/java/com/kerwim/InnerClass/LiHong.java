package com.kerwim.InnerClass;

public class LiHong {
    static int age;
    double money;
    
    static class LiXiaoHong {
        public LiXiaoHong (){
            System.out.println(age);
//            System.out.println(money);
        }
    }
}