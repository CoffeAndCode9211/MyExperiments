package org.learn.java.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class UserNoClone {

	private List<String> lstUser;

	public UserNoClone() {
		lstUser = new ArrayList<String>();
	}

	public UserNoClone(List<String> lstUser) {
		this.lstUser = lstUser;
	}

	public void loadUser() {
		lstUser.add("Ashish");
		lstUser.add("Amit");
		lstUser.add("Test");
		lstUser.add("Hello");
	}

	public List<String> getUsers() {
		return lstUser;
	}

}
