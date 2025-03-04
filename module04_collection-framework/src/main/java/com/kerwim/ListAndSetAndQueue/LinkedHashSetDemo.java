package com.kerwim.ListAndSetAndQueue;

import java.util.LinkedHashSet;

/**
 *
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 添加元素
        set.add("kerwim");
        set.add("kevin");
        set.add("牛马");

        // 删除元素
        set.remove("kevin");

        // 修改元素
        set.remove("牛马");
        set.add("纯牛马");

        // 查找元素
        boolean hasKerwim = set.contains("kerwim");
        System.out.println("set包含kerwim吗？" + hasKerwim);
    }

}
