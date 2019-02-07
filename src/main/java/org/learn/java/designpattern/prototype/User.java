package org.learn.java.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable {

	private List<String> lstUser;

	public User() {
		lstUser = new ArrayList<String>();
	}

	public User(List<String> lstUser) {
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

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for(String s : this.getUsers()){
			temp.add(s);
		}
		return new User(temp);
	}

}
