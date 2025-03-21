package com.kerwim.LinkedHashMapDetail;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("张","张无忌");
        linkedHashMap.put("赵","赵敏");
        linkedHashMap.put("韦","韦一笑");
        linkedHashMap.put("灭","灭绝师太");
        linkedHashMap.put(null,null);

        for(String key:linkedHashMap.keySet()){
            System.out.println(key + " : " + linkedHashMap.get(key));
        }


        Map<String,String> linkedHashMap2 = new LinkedHashMap<>(16,.75f,true);
        linkedHashMap2.put("灭","灭绝师太");
        linkedHashMap2.put("绝","灭绝师太");
        linkedHashMap2.put("师","灭绝师太");
        linkedHashMap2.put("太","灭绝师太");

        System.out.println(linkedHashMap2);

        linkedHashMap2.get("绝");
        System.out.println(linkedHashMap2);

        linkedHashMap2.get("师");
        System.out.println(linkedHashMap2);


        MyLinkedHashMap<String,String> map = new MyLinkedHashMap<>(16,0.75f,true);
        map.put("灭","灭绝师太");
        map.put("绝","灭绝师太");
        map.put("师","灭绝师太");
        map.put("太","灭绝师太");
        map.put("一个固执倔强的老女人","一个固执倔强的老女人");

        System.out.println(map);

        map.put("一个顽固迂腐的老女人","一个顽固迂腐的老女人");
        System.out.println(map);

        map.get("绝");
        map.put("一个爱恨分明的老女人","一个爱恨分明的老女人");
        System.out.println(map);
    }
}
