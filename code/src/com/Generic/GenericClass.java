package com.Generic;

public class GenericClass<E> {
    private E name;
    private E age;
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }
}
