package org.learn.java.designpattern.builder;

public class Computer {

	private String HDD;
	private String CPU;

	// optional
	private boolean isGraphicsCardReq;
	private boolean isBluetoothReq;

	public String getHDD() {
		return HDD;
	}

	public String getCPU() {
		return CPU;
	}

	public boolean isGraphicsCardReq() {
		return isGraphicsCardReq;
	}

	public boolean isBluetoothReq() {
		return isBluetoothReq;
	}

	private Computer(ComputerBuilder builder) {

		this.HDD = builder.HDD;
		this.CPU = builder.CPU;
		this.isBluetoothReq = builder.isBluetoothReq;
		this.isGraphicsCardReq = builder.isGraphicsCardReq;
	}

	public static class ComputerBuilder {

		// required parameters
		private String HDD;
		private String CPU;

		// optional parameters
		private boolean isGraphicsCardReq;
		private boolean isBluetoothReq;

		public ComputerBuilder(String hdd, String cpu) {
			this.HDD = hdd;
			this.CPU = cpu;
		}

		public ComputerBuilder setGraphicsCardReq(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardReq = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothReq(boolean isBluetoothEnabled) {
			this.isBluetoothReq = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
