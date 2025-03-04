package com.kerwim.InnerClass;

/**
 * 成员内部类
 */
class kerwim {
    int age = 18;
    private String name = "kerwim";
    static double money = 1;

    public kerwim () {
        new kevin().print();
    }
    
    class kevin {
        int age = 81;
        public void print() {
            System.out.println(name);
            System.out.println(money);
        }
    }

    public static void main(String[] args) {
        kerwim kerwim = new kerwim();
        kevin kevin = kerwim.new kevin();
        kevin.print();
    }
}