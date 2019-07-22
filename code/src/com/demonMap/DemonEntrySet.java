package com.demonMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemonEntrySet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("黄晓明","杨颖");
        map.put("陈赫","胡一菲");
        map.put("冷风","龙小云");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //使用迭代器循环
        /*Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+entry.getValue());
        }*/
        //使用增强for循环
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
