package org.learn.java.designpattern.singleton;

public class BillPush {

	private BillPush() {
	}

	private static class Helper {
		private static final BillPush pushObj = new BillPush();
	}

	public static BillPush getInstance() {
		return Helper.pushObj;
	}
}
