package com.demonMap;

import java.util.HashMap;
import java.util.Map;

public class DemonMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String m1 = map.put("A","a");
        System.out.println(m1);
        String m2 = map.put("A", "aa");
        System.out.println(m2);
        System.out.println(map);

    }
}
