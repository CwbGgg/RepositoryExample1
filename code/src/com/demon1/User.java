package com.demon1;

public class User {
    private String name;
    private int money;

    public User(){

    }
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (money != user.money) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }


    public void show(){
        System.out.println("我叫"+name+" ,我有多少钱："+money);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
