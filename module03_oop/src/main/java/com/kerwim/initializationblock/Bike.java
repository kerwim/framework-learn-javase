package com.kerwim.initializationblock;

import java.util.ArrayList;
import java.util.List;

public class Bike {
    List<String> list;

    {
        list = new ArrayList<>();
        list.add("kerwim");
        list.add("kerwim");
    }

    public static void main(String[] args) {
        System.out.println(new Bike().list);
    }
}