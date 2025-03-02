package com.kerwim.basicDataType;

/**
 * 引用数据类型
 */
public class ReferenceDataType {

    private String a;
    static String b;

    public static void main(String[] args) {
        ReferenceDataType lv = new ReferenceDataType();
        System.out.println(lv.a);
        System.out.println(b);
    }


}
