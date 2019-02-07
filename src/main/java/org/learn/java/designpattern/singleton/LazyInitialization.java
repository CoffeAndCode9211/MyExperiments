package org.learn.java.designpattern.singleton;

public class LazyInitialization {

	private static LazyInitialization lazyInstance;

	private LazyInitialization() {

	}

	// OK for single thread Application
	public static LazyInitialization getLazyClass() {

		if (lazyInstance == null) {
			lazyInstance = new LazyInitialization();
		}
		return lazyInstance;
	}

}
