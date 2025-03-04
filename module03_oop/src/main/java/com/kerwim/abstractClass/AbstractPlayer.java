package com.kerwim.abstractClass;

/**
 * 抽象嘞
 */
public abstract class AbstractPlayer {
    abstract void play();
    
    public void sleep() {
        System.out.println("运动员也要休息而不是挑战极限");
    }
}