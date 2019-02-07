package org.learn.java.designpattern.factory;

public abstract class Computer {

	public abstract String getRAM();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", CPU=" + this.getCPU();
	}

}
