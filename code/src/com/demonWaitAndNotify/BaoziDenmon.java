package com.demonWaitAndNotify;
/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
         void notify() 唤醒在此对象监视器上等待的单个线程。
         void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class BaoziDenmon {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建一个消费者线程
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                synchronized (obj){
                    System.out.println("告知老板要买包子");
                    //调用wait方法，放弃cpu的执行，进入无限等待情况

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("包子已经做好了，开吃");

                }
            }
        }.start();


        //创建一个老板的线程
        new Thread(){
            @Override
            public void run() {
                //花了5秒
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("包子已经坐哈了，可以吃了");
                    //唤醒消费者
                    obj.notify();
                }



            }
        }.start();
    }
}
