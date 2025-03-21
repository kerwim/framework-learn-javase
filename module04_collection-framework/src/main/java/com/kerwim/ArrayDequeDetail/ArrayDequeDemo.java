package com.kerwim.ArrayDequeDetail;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 *
 */
public class ArrayDequeDemo {

    public static void main(String[] args) {
        // 声明一个双端队列
        ArrayDeque<String> stack = new ArrayDeque<>();

        // 增加元素
        stack.push("张无忌");
        stack.push("周芷若");
        stack.push("赵敏");

        // 获取栈顶元素
        String top = stack.peek();
        System.out.println("栈顶元素为：" + top); // 赵敏

        // 弹出栈顶元素
        String pop = stack.pop();
        System.out.println("弹出的元素为：" + pop); // 赵敏

        // 修改栈顶元素
        stack.pop();
        stack.push("小明");
        System.out.println("修改后的栈为：" + stack); // [小明, 张无忌]

        // 遍历队列查找元素
        Iterator<String> iterator = stack.iterator();
        int index = -1;
        String target = "张无忌";
        while (iterator.hasNext()) {
            String element = iterator.next();
            index++;
            if (element.equals(target)) {
                break;
            }
        }

        if (index == -1) {
            System.out.println("元素 " + target + " 不存在于队列中");
        } else {
            System.out.println("元素 " + target + " 在队列中的位置为：" + index);
        }
    }
}
