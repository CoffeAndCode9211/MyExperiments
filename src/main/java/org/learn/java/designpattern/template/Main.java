package org.learn.java.designpattern.template;

public class Main {
	public static void main(String[] args) {
		
		Game g = new Chess();
		g.play();
		
		g = new Football();
		g.play();
	}
}
