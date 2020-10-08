package com.wang.threadlocal;

public class MyThreadLocal implements Runnable {
    ThreadLocal<String> name = new ThreadLocal<>();

    @Override
    public void run() {
        name.set(Thread.currentThread().getName());

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("当前线程名字：%s, 线程内的name属性是：%s", Thread.currentThread().getName(), name.get()));
    }

    public static void main(String[] args) {
        MyThreadLocal runnable = new MyThreadLocal();

        Thread t1 = new Thread(runnable, "t1");
        Thread t2 = new Thread(runnable, "t2");
        Thread t3 = new Thread(runnable, "t3");
        Thread t4 = new Thread(runnable, "t4");
        Thread t5 = new Thread(runnable, "t5");

        t1.start();
        t2.start();
        t4.start();
        t5.start();
        t3.start();
    }
}
