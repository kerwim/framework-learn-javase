package com.kerwim.AnnotationDemo;

public class JsonFieldTest {
    public static void main(String[] args) throws IllegalAccessException {
        Writer kerwim = new Writer(18,"kerwim","牛马程序员");
        System.out.println(JsonSerializer.serialize(kerwim));
    }
}