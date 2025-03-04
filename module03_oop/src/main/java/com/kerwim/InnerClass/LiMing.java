package com.kerwim.InnerClass;

public class LiMing {
    public LiMing print() {
        class LiXiaoMing extends LiMing{
            private int age = 18;
        }
        return new LiXiaoMing();
    }
}