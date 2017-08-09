package com.wang;

public class Synchronized {

	public static void main(String[] args) {
		Seller s = new Seller();
		Thread t1 = new Thread(s, "1");
		Thread t2 = new Thread(s, "2");
		Thread t3 = new Thread(s, "3");
		Thread t4 = new Thread(s, "4");
		Thread t5 = new Thread(s, "5");
		Thread t6 = new Thread(s, "6");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}