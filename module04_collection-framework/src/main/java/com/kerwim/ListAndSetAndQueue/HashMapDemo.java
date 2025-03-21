package com.kerwim.ListAndSetAndQueue;

import java.util.HashMap;

/**
 *
 */
public class HashMapDemo {

    public static void main(String[] args) {
        // 创建一个 HashMap 对象
        HashMap<String, String> hashMap = new HashMap<>();

        // 添加键值对
        hashMap.put("张无忌", "zhangwuji");
        hashMap.put("周芷若", "zhouzhiruo");
        hashMap.put("赵敏", "zhaomin");

        // 遍历 HashMap
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(key + " 对应的值为：" + value);
        }

        // 获取指定键的值
        String value1 = hashMap.get("张无忌");
        System.out.println("张无忌对应的值为：" + value1);

        // 修改键对应的值
        hashMap.put("张无忌", "zhangsanfeng");
        String value2 = hashMap.get("张无忌");
        System.out.println("修改后张无忌对应的值为：" + value2);

        // 删除指定键的键值对
        hashMap.remove("赵敏");

        // 遍历 HashMap
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(key + " 对应的值为：" + value);
        }
    }
}
