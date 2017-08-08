package com.wang;

public class Seller implements Runnable {
	private String name;

	public Seller(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			if (Synchronized.ticket > 0) {
				System.out.println("线程" + name + "正在卖票,剩余" + Synchronized.ticket);
				Synchronized.ticket--;
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