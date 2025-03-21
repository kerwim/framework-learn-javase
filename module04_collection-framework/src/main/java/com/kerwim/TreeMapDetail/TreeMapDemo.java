package com.kerwim.TreeMapDetail;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 */
public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer,String> mapInt = new TreeMap<>();

        mapInt.put(3,"灭绝师太");
        mapInt.put(2,"灭绝师太");
        mapInt.put(1,"灭绝师太");
        mapInt.put(5,"灭绝师太");
        mapInt.put(4,"灭绝师太");

        System.out.println(mapInt);


        //==================================================================================================


        TreeMap<String,String> mapString = new TreeMap<>();

        mapString.put("c","灭绝师太");
        mapString.put("b","灭绝师太");
        mapString.put("a","灭绝师太");
        mapString.put("e","灭绝师太");
        mapString.put("d","灭绝师太");

        System.out.println(mapString);


        //==================================================================================================


        TreeMap<Integer,String> mapIntReverse = new TreeMap<>(Comparator.reverseOrder());

        mapIntReverse.put(3,"灭绝师太");
        mapIntReverse.put(2,"灭绝师太");
        mapIntReverse.put(1,"灭绝师太");
        mapIntReverse.put(5,"灭绝师太");
        mapIntReverse.put(4,"灭绝师太");

        System.out.println(mapIntReverse);

        Integer highestKey = mapInt.lastKey();
        Integer lowestKey = mapInt.firstKey();
        Set<Integer> keysLessThan3 = mapInt.headMap(3).keySet();
        Set<Integer> keysGreaterThanEqTo3 = mapInt.tailMap(3).keySet();

        System.out.println(highestKey);
        System.out.println(lowestKey);

        System.out.println(keysLessThan3);
        System.out.println(keysGreaterThanEqTo3);
    }
}
