package com.kerwim.OverloadOverride;

public class Bike2 extends Vehicle2 {
    @Override
    void run() {
        System.out.println("自行车在跑");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Bike2();
        bike2.run();
    }
}

class Vehicle2 {
    void run() {
        System.out.println("车辆在跑");
    }
}