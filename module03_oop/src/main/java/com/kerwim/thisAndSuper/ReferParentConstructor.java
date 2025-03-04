package com.kerwim.thisAndSuper;

public class ReferParentConstructor {
    public static void main(String[] args) {
        new Dog3();
    }
}

class Animal3 {
    Animal3(){
        System.out.println("动物来了");
    }
}

class Dog3 extends Animal3 {
    Dog3() {
        super();
        System.out.println("狗狗来了");
    }
}