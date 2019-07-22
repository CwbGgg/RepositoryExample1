package com.demon1;

import java.util.ArrayList;

public class Manage extends User{
    public Manage(){

    }

    public Manage(String name, int money) {
        super(name, money);
    }

    //发红包的函数方法
    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干及集合
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看看自己有多少钱
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣钱,重新设置余额
        super.setMoney(leftMoney-totalMoney);

        //发红包需要平均拆分成count份数
        int avg = totalMoney/count;
        int mod = totalMoney%count;//余数，也就是摔下来的零头

        //包在最后一个红包当中
        //下面的红包一个一个的放到集合当中
        for(int i =0;i<count;i++){
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
