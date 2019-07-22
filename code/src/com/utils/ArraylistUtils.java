package com.utils;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Arrays;

/*
Array是一个与数组有关的工具类
public static String toString(数组),将数组变成字符串类型

 public static void sort(数组)
 */
public class ArraylistUtils {
    public static void main(String[] args) {
        int [] intArray={10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        System.out.println("========================");
        int [] array1 = {2,4,1,0,7,9};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("========================");
        String [] array2={"bbb","zzzzzz","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
