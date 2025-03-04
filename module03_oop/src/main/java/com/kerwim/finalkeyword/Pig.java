package com.kerwim.finalkeyword;

public class Pig {
   private String name;

    private final int age = 1;
    public static final double PRICE = 36.5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        final Pig pig = new Pig();
        pig.setName("一蜘蛛");
        System.out.println(pig.getName());
    }
}