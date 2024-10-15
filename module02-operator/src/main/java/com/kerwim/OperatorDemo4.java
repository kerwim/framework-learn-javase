package com.kerwim;

public class OperatorDemo4 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //a += b;
        a = (byte)(a + b);
        //30
        System.out.println(a);
    }
}