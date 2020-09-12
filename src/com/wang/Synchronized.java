package com.wang;

public class Synchronized {
    public static void main(String[] args) {
        Integer ticket = 8;

        Seller.ticket = ticket;

        Thread t1 = new Thread(new Seller("赵"));
        Thread t2 = new Thread(new Seller("钱"));
        Thread t3 = new Thread(new Seller("孙"));
        Thread t4 = new Thread(new Seller("李"));
        Thread t5 = new Thread(new Seller("周"));
        Thread t6 = new Thread(new Seller("吴"));
        Thread t7 = new Thread(new Seller("郑"));
        Thread t8 = new Thread(new Seller("王"));
        Thread t9 = new Thread(new Seller("冯"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
    }
}