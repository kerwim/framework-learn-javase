package com.kerwim.VariableParameters;

/**
 * 可变参数示例
 */
public class VariableParametersDemo {

    public static void main(String[] args) {
        print("我");
        print("我", "是");
        print("我", "是", "靓");
        print("我", "是", "靓", "崽");
    }

    public static void print(String... strs) {
        for (String s : strs)
            System.out.print(s);
        System.out.println();
    }
}
