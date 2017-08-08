package com.wang;

public class Synchronized {
	static Integer ticket = 100;

	public static void main(String[] args) {
		Seller s = new Seller("s");
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
		Thread t4 = new Thread(s);
		Thread t5 = new Thread(s);
		Thread t6 = new Thread(s);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}