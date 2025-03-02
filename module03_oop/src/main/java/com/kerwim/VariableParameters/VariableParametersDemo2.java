package com.kerwim.VariableParameters;

/**
 * 可变参数示例
 */
public class VariableParametersDemo2 {

    public static void main(String[] args) {
        print(new String[]{"我"});
        print(new String[]{"我", "是"});
        print(new String[]{"我", "是", "靓"});
        print(new String[]{"我", "是", "靓", "崽"});
    }

    public static void print(String... strs) {
        for (String s : strs)
            System.out.print(s);
        System.out.println();
    }
}
