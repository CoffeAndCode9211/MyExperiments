package org.learn.java;

public class MyThread implements Runnable {
	int number;
	public MyThread(int num) {
		this.number = num;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + number);
	}
}
