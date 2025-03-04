package com.kerwim.ListAndSetAndQueue;

import java.util.TreeSet;

/**
 *
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        // 创建一个 TreeSet 对象
        TreeSet<String> set = new TreeSet<>();

        // 添加元素
        set.add("欧阳锋");
        set.add("周芷若");
        set.add("张无忌");
        System.out.println(set); // 输出 [周芷若, 张无忌, 欧阳锋]

        // 删除元素
        set.remove("周芷若");
        System.out.println(set); // 输出 [张无忌, 欧阳锋]

        // 修改元素：TreeSet 中的元素不支持直接修改，需要先删除再添加
        set.remove("欧阳锋");
        set.add("小昭");
        System.out.println(set); // 输出 [小昭, 张无忌]

        // 查找元素
        System.out.println(set.contains("张无忌")); // 输出 true
        System.out.println(set.contains("欧阳锋")); // 输出 false
    }
}
