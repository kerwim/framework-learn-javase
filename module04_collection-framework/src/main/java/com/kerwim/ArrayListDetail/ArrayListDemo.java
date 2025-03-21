package com.kerwim.ArrayListDetail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        // 创建一个集合
        ArrayList<String> list = new ArrayList<String>();
        // 添加元素
        list.add("张无忌");

        list.add(0, "赵敏");

        list.set(0, "张三丰");

        list.remove(0);
        list.remove("张无忌");

        //正序查找
        list.indexOf("张无忌");
        //倒序查找
        list.lastIndexOf("张无忌");


        List<String> copy = new ArrayList<>(list);
        copy.add("a");
        copy.add("c");
        copy.add("b");
        copy.add("d");

        Collections.sort(copy);
        System.out.println(copy);

        int index = Collections.binarySearch(copy, "b");
    }
}
