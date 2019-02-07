package org.learn.java.designpattern.singleton;

public class Main {
	public static void main(String[] args) {
		
		// calling StaticInitialization
		StaticInitialization.getStaticClass();
		
		
		LazyInitialization.getLazyClass();
	}
}
