package com.wang;

public class Seller implements Runnable {
	private int ticket = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "线程正在卖票,剩余" + ticket);
				ticket--;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}