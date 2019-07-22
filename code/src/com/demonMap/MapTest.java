package com.demonMap;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        //toCharArray将字符串转换为字符数组-------------
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                //表示key存在
                Integer value = map.get(c);
                value++;
                //将新键值对存入
                map.put(c,value);
            }else {
                //key不存在,表示第一次出现
                map.put(c,1);
            }
        }
        //遍历循环所有
        for (Character key : map.keySet()) {
            System.out.print(key+"="+map.get(key)+"\t");
        }



    }
}
