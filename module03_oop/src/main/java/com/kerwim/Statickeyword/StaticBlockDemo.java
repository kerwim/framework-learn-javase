package com.kerwim.Statickeyword;

import java.util.ArrayList;
import java.util.List;

public class StaticBlockDemo {
    public static List<String> writes = new ArrayList<>();

    static {
        writes.add("kerwim1");
        writes.add("kerwim2");
        writes.add("kerwim3");

        System.out.println("第一块");
    }

    static {
        writes.add("kerwim4");
        writes.add("kerwim5");

        System.out.println("第二块");
    }
}