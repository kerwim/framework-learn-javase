package com.kerwim.thisAndSuper;

public class ReferParentMethod {
    public static void main(String[] args) {
        new Dog2().work();
    }
}

class Animal2 {
    void eat() {
        System.out.println("吃...");
    }
}

class Dog2 extends Animal2 {
    @Override
    void eat() {
        System.out.println("吃...");
    }

    void bark() {
        System.out.println("汪汪汪...");
    }

    void work() {
        super.eat();
        bark();
    }
}