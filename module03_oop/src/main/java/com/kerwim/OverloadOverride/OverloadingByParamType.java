package com.kerwim.OverloadOverride;

public class OverloadingByParamType {
    public static void main(String[] args) {
        System.out.println(Adder2.add(10, 19));
        System.out.println(Adder2.add(10.1, 19.2));
    }
}

class Adder2 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}