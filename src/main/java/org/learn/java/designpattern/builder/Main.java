package org.learn.java.designpattern.builder;

public class Main {
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
				.setBluetoothReq(true).setGraphicsCardReq(true).build();
	}
}
