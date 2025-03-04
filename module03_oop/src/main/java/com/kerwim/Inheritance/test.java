package com.kerwim.Inheritance;

class Animal2 {
    public void  sayHello()//父类的方法
    {
        System.out.println("hello,everybody");
    }
}
class Dog2 extends Animal2//继承animal
{ }
public class test {
    public static void main(String[] args) {
       Dog2 dog=new Dog2();
       dog.sayHello();
    }
}