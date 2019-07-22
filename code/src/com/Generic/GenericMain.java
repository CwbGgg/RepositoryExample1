package com.Generic;

public class GenericMain {
    public static void main(String[] args) {
       demon3();
    }

    private static void demon3() {
        GenericClass<Person> gc = new GenericClass<>();
        Person p =new Person("陈文彬");
        gc.setE(p);
        System.out.println(gc.getE());
    }

    private static void demon2() {
        GenericClass<Integer> gc = new GenericClass<>();
        gc.setName(1);
        System.out.println("这个是Integer类型");


    }

    private static void demon1() {
        GenericClass<String> gc = new GenericClass<>();
        gc.setName("这个是字符串");
        System.out.println(gc.getName());
    }

}
