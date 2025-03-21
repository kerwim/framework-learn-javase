package com.kerwim.PriorityQueueDetail;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        // 创建 PriorityQueue 对象
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // 添加元素到 PriorityQueue
        priorityQueue.offer("灭绝师太");
        priorityQueue.offer("周芷若");
        priorityQueue.offer("张无忌");

        // 打印 PriorityQueue 中的元素
        System.out.println("PriorityQueue 中的元素：");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }


        // 创建 PriorityQueue 对象，并指定优先级顺序
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(Comparator.reverseOrder());

        // 添加元素到 PriorityQueue
        priorityQueue2.offer("灭绝师太");
        priorityQueue2.offer("周芷若");
        priorityQueue2.offer("张无忌");

        // 打印 PriorityQueue 中的元素
        System.out.println("PriorityQueue 中的元素：");
        while (!priorityQueue2.isEmpty()) {
            System.out.print(priorityQueue2.poll() + " ");
        }
    }
}
