package com.kerwim.basicDataType;

/**
 * int 和 char 类型互转
 */
public class InterconversionIntAndChar {

    public static void main(String[] args) {

    }

    /**
     * 强制类型转换
     */
    public static void forceTypeConversion() {
        int value_int = 65;
        char value_char  = (char) value_int;
        System.out.println(value_char);
    }

    /**
     * 使用 Character.forDigit() 方法将整型 int 转换为字符 char
     */
    public static void useCharacterForDigit() {
        int radix = 10;
        int value_int = 6;
        char value_char = Character.forDigit(value_int, radix);
        System.out.println(value_char);
    }

    /**
     * 使用 int 的包装器类型 Integer 的 **toString()** 方法+String 的 **charAt()** 方法转成 char
     */
    public static void useIntegerToString() {
        int value_int = 1;
        char value_char = Integer.toString(value_int).charAt(0);
        System.out.println(value_char );
    }

}
