package com.kerwim.abstractClass;

/**
 * 继承抽象类
 */
public class BasketballPlayer extends AbstractPlayer {
    @Override
    void play() {
        System.out.println("我是张伯伦，篮球场上得过 100 分");
    }
}