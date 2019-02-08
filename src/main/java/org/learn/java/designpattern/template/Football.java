package org.learn.java.designpattern.template;

public class Football extends Game {

	@Override
	void init() {
		System.out.println("Football Game initialised");

	}

	@Override
	void start() {
		System.out.println("Football Game started");
	}

	@Override
	void end() {
		System.out.println("Football game ended");
	}

}
