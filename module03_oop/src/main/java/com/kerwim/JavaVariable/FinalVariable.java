package com.kerwim.JavaVariable;

/**
 * final变量  常量
 */
public class FinalVariable {
    final String HELLO = "你好";
    static final String WORLD = "世界";
    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        System.out.println(fv.HELLO);
        System.out.println(WORLD);
    }
}