package org.learn.java.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcHashMapVsSyncMap {

	public final static int THREAD_POOL_SIZE = 5;
 
	public static Map<String, Integer> hashTableObj = null;
	public static Map<String, Integer> syncMapObj = null;
	public static Map<String, Integer> concurrentHashMapObj = null;
 
	public static void main(String[] args) throws InterruptedException {
 
		// Test with Hashtable Object
		hashTableObj = new Hashtable<String, Integer>();
		performTest(hashTableObj);
 
		// Test with synchronizedMap Object
		syncMapObj = Collections.synchronizedMap(new HashMap<String, Integer>());
		performTest(syncMapObj);
 
		// Test with ConcurrentHashMap Object
		concurrentHashMapObj = new ConcurrentHashMap<String, Integer>();
		performTest(concurrentHashMapObj);
 
	}
 
	public static void performTest(final Map<String, Integer> crunchifyThreads) throws InterruptedException {
 
		System.out.println("Test started for: " + crunchifyThreads.getClass());
		long averageTime = 0;
		for (int i = 0; i < 5; i++) {
 
			long startTime = System.nanoTime();
			ExecutorService crunchifyExServer = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
 
			for (int j = 0; j < THREAD_POOL_SIZE; j++) {
				crunchifyExServer.execute(new Runnable() {
					public void run() {
 
						for (int i = 0; i < 500000; i++) {
							Integer crunchifyRandomNumber = (int) Math.ceil(Math.random() * 550000);
 
							// Retrieve value. We are not using it anywhere
							Integer crunchifyValue = crunchifyThreads.get(String.valueOf(crunchifyRandomNumber));
 
							// Put value
							crunchifyThreads.put(String.valueOf(crunchifyRandomNumber), crunchifyRandomNumber);
						}
					}
				});
			}
 
			crunchifyExServer.shutdown();
 
			crunchifyExServer.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
 
			long entTime = System.nanoTime();
			long totalTime = (entTime - startTime) / 1000000L;
			averageTime += totalTime;
			System.out.println("500K entried added/retrieved in " + totalTime + " ms");
		}
		System.out.println("For " + crunchifyThreads.getClass() + " the average time is " + averageTime / 5 + " ms\n");
	}
	
}
