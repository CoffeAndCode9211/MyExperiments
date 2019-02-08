package org.learn.java.designpattern.template;

public class Chess extends Game {

	@Override
	void init() {
		System.out.println("Chess Game initialised");
		
	}

	@Override
	void start() {
		System.out.println("Chess Game started");		
	}

	@Override
	void end() {
		System.out.println("Chess game ended");
	}

}
