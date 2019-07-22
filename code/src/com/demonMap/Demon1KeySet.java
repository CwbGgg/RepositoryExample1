package com.demonMap;

import java.util.*;

public class Demon1KeySet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("陈文彬","180");
        map.put("离开家","182");
        map.put("没耐久","175");
        System.out.println(map);
        //使用Keyset
        Set<String> set = map.keySet();
        //使用的是迭代器
        /*Iterator<String> key = set.iterator();
        while(key.hasNext()){
            String key1 = key.next();
            String val = map.get(key1);
            System.out.println(key1+val);

        }*/
        //使用的是增强for循环
        for (String key : set) {
            String val = map.get(key);
            System.out.println(key+val);
        }
    }
}
