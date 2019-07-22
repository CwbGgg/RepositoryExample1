package com.utils;


import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        String str="cxkjkosdjfiojmkzxcjsdkfjdikfjnsdkfuer";
        char [] chars= str.toCharArray();
        Arrays.sort(chars);
        for (int i =str.length()-1;i>=0;i--){
            System.out.print(chars[i]+"   ");
        }
    }

}
