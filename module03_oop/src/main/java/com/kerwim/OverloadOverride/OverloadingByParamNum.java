package com.kerwim.OverloadOverride;

public class OverloadingByParamNum {
    public static void main(String[] args) {
        System.out.println(Adder.add(10, 19));
        System.out.println(Adder.add(10, 19, 20));
    }
}

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}