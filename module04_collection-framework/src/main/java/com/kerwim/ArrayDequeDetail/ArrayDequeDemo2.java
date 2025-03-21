package com.kerwim.ArrayDequeDetail;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 *
 */
public class ArrayDequeDemo2 {

    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();

        // 增加元素
        queue.offer("赵敏");
        queue.offer("小昭");
        queue.offer("周芷若");

        // 获取队首元素
        String front = queue.peek();
        System.out.println("队首元素为：" + front); // 赵敏

        // 弹出队首元素
        String poll = queue.poll();
        System.out.println("弹出的元素为：" + poll); // 赵敏

        // 修改队列中的元素
        queue.poll();
        queue.offer("小明");
        System.out.println("修改后的队列为：" + queue); // [周芷若, 小明]

        // 查找元素
        Iterator<String> iterator = queue.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("周芷若")) {
                System.out.println("元素在队列中的位置为：" + index); // 0
                break;
            }
            index++;
        }
    }
}
