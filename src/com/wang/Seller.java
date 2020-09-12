package com.wang;

public class Seller implements Runnable {
    public static Integer ticket;

    private String name;

    public Seller(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (this.getClass()) {
            if (ticket > 0) {
                System.out.println("老" + name + "正在卖票,剩余" + --ticket);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(name + "没有票卖了");
            }
        }
    }
}