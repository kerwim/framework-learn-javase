package com.kerwim.HashMapDetail;

import java.util.HashMap;

/**
 *
 */
public class HashMaoDemo2 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zhangwuji", "张无忌");
        map.put("zhaomin", "赵敏");
        map.put("zhouzhiruo", "周芷若");
        map.put("xiaozhao", "小昭");
        map.put("yinyewang", "殷野王");
        map.put("yideng", "殷离");
        map.put("yangxiao", "杨逍");
        map.put("weiyixiao", "韦一笑");

        // 遍历 HashMap
        for (String key : map.keySet()) {
            int h, n = 32;
            int hash = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            int i = (n - 1) & hash;
            // 打印 key 的 hash 值 和 索引 i
            System.out.println(key + "的hash值 : " + hash +" 的索引 : " + i);
        }
    }
}
