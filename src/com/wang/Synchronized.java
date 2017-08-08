package com.wang;

public class Synchronized {
	static Integer ticket = 100;
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1("1", ticket));
		Thread t2 = new Thread(new Thread1("2", ticket));
		Thread t3 = new Thread(new Thread1("3", ticket));
		Thread t4 = new Thread(new Thread1("4", ticket));
		Thread t5 = new Thread(new Thread1("5", ticket));
		Thread t6 = new Thread(new Thread1("6", ticket));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}

class Thread1 implements Runnable {
	private String name;

	public Thread1(String name, Integer ticket) {
		this.name = name;		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			while (Synchronized.ticket > 0) {
				Synchronized.ticket--;
				System.out.println("线程" + name + "正在卖票,剩余" + Synchronized.ticket);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("没票了！！！！");
		}
	}
}