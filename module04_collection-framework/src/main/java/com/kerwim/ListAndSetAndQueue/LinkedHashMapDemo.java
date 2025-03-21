package com.kerwim.ListAndSetAndQueue;

import java.util.LinkedHashMap;

/**
 *
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        // 创建一个 LinkedHashMap，插入的键值对为 沉默 王二 陈清扬
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("张无忌", "zhangwuji");
        linkedHashMap.put("赵敏", "zhaomin");
        linkedHashMap.put("周芷若", "zhouzhiruo");

        // 遍历 LinkedHashMap
        for (String key : linkedHashMap.keySet()) {
            String value = linkedHashMap.get(key);
            System.out.println(key + " 对应的值为：" + value);
        }
    }
}
