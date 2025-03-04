package com.kerwim.ListAndSetAndQueue;

import java.util.ArrayDeque;

/**
 *
 */
public class ArrayDequeDemo {

    public static void main(String[] args) {
        // 创建一个ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // 添加元素
        deque.add("周芷若");
        deque.add("张无忌");
        deque.add("赵敏");

        // 删除元素
        deque.remove("赵敏");

        // 修改元素
        deque.remove("周芷若");
        deque.add("小昭");

        // 查找元素
        boolean hasZhangWuJi = deque.contains("张无忌");
        System.out.println("deque包含张无忌吗？" + hasZhangWuJi);
    }
}
