package org.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumPrinter {

	static ArrayList<Integer> randomNum = new ArrayList<Integer>();

	public static void print(int numThreads, int maxNum) {
		
		// generate random no between 0 and maxNum
		for (int i = 0; i <= maxNum; i++) {
			randomNum.add(i);
		}
		Collections.shuffle(randomNum);

		// run numThread
		ExecutorService executor = Executors.newFixedThreadPool(numThreads);
		for (Integer randNo : randomNum) {
			MyThread cls = new MyThread(randNo);
			executor.execute(cls);
		}
		executor.shutdown();
	}

	public static void main(String[] args) {
		print(5, 10);
	}
}
