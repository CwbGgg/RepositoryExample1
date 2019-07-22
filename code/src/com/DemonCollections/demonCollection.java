package com.DemonCollections;

import java.util.ArrayList;
import java.util.Collections;

public class demonCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //调用public static <T> boolean addAll(Collections<T> c,T... element);
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
        //向集合当中打乱元素的顺序
        Collections.shuffle(list);
        System.out.println("shuffle后 :"+list);
    }
}
