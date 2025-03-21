package com.kerwim.ListAndSetAndQueue;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 */
public class LinkedListQueueDemo {

    public static void main(String[] args) {
        // 创建一个 LinkedList 对象
        LinkedList<String> queue = new LinkedList<>();

        // 添加元素
        queue.offer("周芷若");
        queue.offer("赵敏");
        queue.offer("张无忌");
        System.out.println(queue); // 输出 [周芷若, 赵敏, 张无忌]

        // 删除元素
        queue.poll();
        System.out.println(queue); // 输出 [赵敏, 张无忌]

        // 修改元素：LinkedList 中的元素不支持直接修改，需要先删除再添加
        String first = queue.poll();
        queue.offer("小昭");
        System.out.println(queue); // 输出 [张无忌, 小昭]

        // 查找元素：LinkedList 中的元素可以使用 get() 方法进行查找
        System.out.println(queue.get(0)); // 输出 张无忌
        System.out.println(queue.contains("张无忌")); // 输出 true

        // 查找元素：使用迭代器的方式查找陈清扬
        // 使用迭代器依次遍历元素并查找
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("小昭")) {
                System.out.println("找到了：" + element);
                break;
            }
        }
    }
}
