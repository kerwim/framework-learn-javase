package com.kerwim.LinkedListDetail;

import java.util.LinkedList;

/**
 *
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();

        list.add("张无忌");
        list.add("赵敏");
        list.add("灭绝师太");

        list.set(0, "张三丰");
    }
}
