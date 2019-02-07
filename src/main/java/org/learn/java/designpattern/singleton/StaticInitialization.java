package org.learn.java.designpattern.singleton;

public class StaticInitialization {

	private static StaticInitialization instance;

	private StaticInitialization() {
	}

	static {
		try {
			System.out.println("calling StaticInitialization");
			instance = new StaticInitialization();
		} catch (Exception e) {
			throw new RuntimeException(
					"Error while creating StaticInitialization");
		}
	}

	public static StaticInitialization getStaticClass() {
		return instance;
	}
}
