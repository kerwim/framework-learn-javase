package com.kerwim.ListAndSetAndQueue;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class TreeMapDemo {

    public static void main(String[] args) {
        // 创建一个 TreeMap 对象
        Map<String, String> treeMap = new TreeMap<>();

        // 向 TreeMap 中添加键值对
        treeMap.put("周芷若", "zhouzhiruo");
        treeMap.put("张无忌", "zhangwuji");
        treeMap.put("赵敏", "zhaomin");

        // 查找键值对
        String name = "张无忌";
        if (treeMap.containsKey(name)) {
            System.out.println("找到了 " + name + ": " + treeMap.get(name));
        } else {
            System.out.println("没有找到 " + name);
        }

        // 修改键值对
        name = "张无忌";
        if (treeMap.containsKey(name)) {
            System.out.println("修改前的 " + name + ": " + treeMap.get(name));
            treeMap.put(name, "newzhangwuji");
            System.out.println("修改后的 " + name + ": " + treeMap.get(name));
        } else {
            System.out.println("没有找到 " + name);
        }

        // 删除键值对
        name = "周芷若";
        if (treeMap.containsKey(name)) {
            System.out.println("删除前的 " + name + ": " + treeMap.get(name));
            treeMap.remove(name);
            System.out.println("删除后的 " + name + ": " + treeMap.get(name));
        } else {
            System.out.println("没有找到 " + name);
        }

        // 遍历 TreeMap
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        // 创建一个 TreeMap 对象
        Map<String, String> treeMap2 = new TreeMap<>();

        // 向 TreeMap 中添加键值对
        treeMap2.put("c", "cat");
        treeMap2.put("a", "apple");
        treeMap2.put("b", "banana");

        // 遍历 TreeMap
        for (Map.Entry<String, String> entry : treeMap2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
