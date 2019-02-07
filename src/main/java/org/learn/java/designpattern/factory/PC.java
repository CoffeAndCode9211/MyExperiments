package org.learn.java.designpattern.factory;

public class PC extends Computer {

	private String ram;
	private String cpu;

	public PC(String ram, String cpu) {
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}
