package com.DemonThread;

public class DemonTicket {
    public static void main(String[] args) {
        //创建一个Runnable的接口的实现类
        RunnableImpl run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start的方法
        t0.start();
        t1.start();
        t2.start();
    }
}
