package com.kerwim.String;

public class Test7Sensitivewordreplacement {
    public static void main(String[] args) {
        //1.定义一个变量表示骂人的话
        String talk = "亚索你玩什么啊，TMD";
        //2.把这句话中的敏感词进行替换
        String result = talk.replace("TMD", "***");
        //3.打印
        System.out.println(talk);
        System.out.println(result);
    }
}