package com.kerwim.instanceofKeyword;

class Circle extends Round implements Shape {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle instanceof Circle);

        System.out.println(circle instanceof Shape);

//        System.out.println(circle instanceof Triangle);
    }
}