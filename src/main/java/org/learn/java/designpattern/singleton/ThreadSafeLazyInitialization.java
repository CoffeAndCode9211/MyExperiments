package org.learn.java.designpattern.singleton;

public class ThreadSafeLazyInitialization {

	private static ThreadSafeLazyInitialization lazyInstance;

	private ThreadSafeLazyInitialization() {

	}

	// This is thread safe but reduces the performance
	public static synchronized ThreadSafeLazyInitialization getLazyClass() {

		if (lazyInstance == null) {
			lazyInstance = new ThreadSafeLazyInitialization();
		}
		return lazyInstance;
	}

	// better than above method. double checked locking principle is used.
	public static ThreadSafeLazyInitialization getLazyImproveClass() {

		if (lazyInstance == null) {
			synchronized (ThreadSafeLazyInitialization.class) {
				if (lazyInstance == null) {
					lazyInstance = new ThreadSafeLazyInitialization();
				}
			}
		}
		return lazyInstance;
	}

}
