package com.cwb;

import java.util.ArrayList;

public class ArrayListDemon1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("陈文彬");
        list.add("王海");
        list.add("立即");
        list.add("科技哦");
        list.add("女的");
        System.out.println(list);
        System.out.println("================================");
        boolean remove = list.remove("王海");
        System.out.println(remove);
        System.out.println("================================");
        String remove1 = list.remove(2);
        System.out.println(remove1);
    }
}
