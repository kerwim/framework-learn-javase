package com.kerwim.ListAndSetAndQueue;

import java.util.HashSet;

/**
 *
 */
public class HashSetDemo {

    public static void main(String[] args) {
        // 创建一个新的HashSet
        HashSet<String> set = new HashSet<>();

        // 添加元素
        set.add("kerwim");
        set.add("kevin");
        set.add("牛马");

        // 输出HashSet的元素个数
        System.out.println("HashSet size: " + set.size()); // output: 3

        // 判断元素是否存在于HashSet中
        boolean kerwim = set.contains("kerwim");
        System.out.println("Does set contain 'kerwim'? " + kerwim); // output: true

        // 删除元素
        boolean removeKerwim = set.remove("kerwim");
        System.out.println("Removed 'kerwim'? " + removeKerwim); // output: true

        // 修改元素，需要先删除后添加
        boolean removeKerwim2 = set.remove("kevin");
        boolean addLucy = set.add("Lucy");
        System.out.println("Modified set? " + (removeKerwim2 && addLucy)); // output: true

        // 输出修改后的HashSet
        System.out.println("HashSet after modification: " + set); // output: [Lucy, 牛马]
    }
}
