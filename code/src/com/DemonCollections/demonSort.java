package com.DemonCollections;

import com.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demonSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);
        Collections.sort(list); //升序排列
        System.out.println(list);
        System.out.println("=====================");
        ArrayList<Person> plist = new ArrayList<>();
        plist.add(new Person("杨幂",19));
        plist.add(new Person("迪丽热巴",17));
        plist.add(new Person("哪咤",25));
        Collections.sort(plist, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge(); //升序
            }
        });
        System.out.println(plist);
    }
}
