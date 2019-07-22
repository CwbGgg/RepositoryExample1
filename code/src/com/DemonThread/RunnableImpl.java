package com.DemonThread;

public class RunnableImpl implements Runnable{

    /*
    卖票案例的线程安全的问题
     */
    private Integer ticket = 100;

    //创建一个锁对象
    Object obj = new Object();



    @Override
    public void run() {
        //使用死循环
        while (true){
            //同步代码块
//            synchronized (obj){
//                if(ticket> 0){
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    //票存在，就卖
//                    System.out.println(Thread.currentThread().getName()+"->正在卖"+ticket+"张票");
//                    ticket--;
//                }
//            }

            payTicket();

        }
    }

    //定义一个同步的方法
    public synchronized void payTicket(){
        if(ticket> 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //票存在，就卖
            System.out.println(Thread.currentThread().getName()+"->正在卖"+ticket+"张票");
            ticket--;
        }
    }
}
