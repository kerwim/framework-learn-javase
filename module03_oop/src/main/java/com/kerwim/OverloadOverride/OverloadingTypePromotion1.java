package com.kerwim.OverloadOverride;

public class OverloadingTypePromotion1 {
    void sum(int a, int b) {
        System.out.println("int");
    }

    void sum(long a, long b) {
        System.out.println("long");
    }

    public static void main(String args[]) {
        OverloadingTypePromotion1 obj = new OverloadingTypePromotion1();
        obj.sum(20, 20);
    }
}