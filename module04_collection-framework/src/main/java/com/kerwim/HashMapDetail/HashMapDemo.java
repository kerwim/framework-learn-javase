package com.kerwim.HashMapDetail;

import java.util.HashMap;

/**
 *
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵敏", 20);
        map.put("小昭", 25);

        map.remove("赵敏");

        map.put("小昭", 30);

        int age = map.get("小昭");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("zhouzhiruo", " 周芷若");
        map2.put("miejueshitai", "灭绝师太");
        map2.put("zhangwuji", "张无忌");
        map2.put("zhangsanfeng", "张三丰");
        map2.put("xiaozhao", " 小昭");

        // 遍历 HashMap
        for (String key : map.keySet()) {
            int h, n = 16;
            int hash = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            int i = (n - 1) & hash;
            // 打印 key 的 hash 值 和 索引 i
            System.out.println(key + "的hash值 : " + hash +" 的索引 : " + i);
        }
    }
}
