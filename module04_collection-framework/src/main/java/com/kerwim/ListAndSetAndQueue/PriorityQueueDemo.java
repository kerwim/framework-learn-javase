package com.kerwim.ListAndSetAndQueue;

import java.util.PriorityQueue;

/**
 *
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        // 创建一个 PriorityQueue 对象
        PriorityQueue<String> queue = new PriorityQueue<>();

        // 添加元素
        queue.offer("张无忌");
        queue.offer("赵敏");
        queue.offer("周芷若");
        System.out.println(queue); // 输出 [周芷若, 赵敏, 张无忌]

        // 删除元素
        queue.poll();
        System.out.println(queue); // 输出 [张无忌, 赵敏]

        // 修改元素：PriorityQueue 不支持直接修改元素，需要先删除再添加
        String first = queue.poll();
        queue.offer("张三");
        System.out.println(queue); // 输出 [张三, 赵敏]

        // 查找元素：PriorityQueue 不支持随机访问元素，只能访问队首元素
        System.out.println(queue.peek()); // 输出 张三
        System.out.println(queue.contains("赵敏")); // 输出 false

        // 通过 for 循环的方式查找赵敏
        for (String element : queue) {
            if (element.equals("赵敏")) {
                System.out.println("找到了：" + element);
                break;
            }
        }
    }
}
