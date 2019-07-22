package com.demon1;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        if(list!=null){
            int index = new Random().nextInt(list.size());
            Integer delta = list.remove(index);
            int money = super.getMoney();
            super.setMoney(money+delta);
        }



    }
}
