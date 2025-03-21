package com.kerwim.LinkedHashMapDetail;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 自定义的 MyLinkedHashMap 类，继承了 Java 中内置的 LinkedHashMap<K, V> 类。
 * 用于实现一个具有固定大小的缓存，当缓存达到最大容量时，会自动移除最早加入的元素，以腾出空间给新的元素。
 *
 * @param <K> 键的类型
 * @param <V> 值的类型
 */
public class MyLinkedHashMap<K, V> extends LinkedHashMap<K, V> {

    private static final int MAX_ENTRIES = 5; // 表示 MyLinkedHashMap 中最多存储的键值对数量

    /**
     * 构造方法，使用 super() 调用了父类的构造函数，并传递了三个参数：initialCapacity、loadFactor 和 accessOrder。
     *
     * @param initialCapacity 初始容量
     * @param loadFactor      负载因子
     * @param accessOrder     访问顺序
     */
    public MyLinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    /**
     * 重写父类的 removeEldestEntry() 方法，用于指示是否应该移除最早加入的元素。
     * 如果返回 true，那么将删除最早加入的元素。
     *
     * @param eldest 最早加入的元素
     * @return 如果当前 MyLinkedHashMap 中元素的数量大于 MAX_ENTRIES，返回 true，否则返回 false。
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }

}