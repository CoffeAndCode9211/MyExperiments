package org.learn.java.designpattern.prototype;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User();
		user.loadUser();
		
		User u1 = (User) user.clone();
		User u2 = (User) user.clone();
		
		u1.getUsers().add("User1");
		u2.getUsers().add("User2");
		
		System.out.println("Main User List: "+user.getUsers());
		System.out.println("User1 List: "+u1.getUsers());
		System.out.println("User2 List: "+u2.getUsers());
		
		
		
		System.out.println("===Object without Clone===");
		UserNoClone u = new UserNoClone();
		u.loadUser();
		
		UserNoClone uu1 = u;
		UserNoClone uu2 = u;
		uu1.getUsers().add("User1");
		uu2.getUsers().add("User2");
		
		System.out.println("Main UserNo List: "+u.getUsers());
		System.out.println("User1No List: "+uu1.getUsers());
		System.out.println("User2No List: "+uu2.getUsers());
		
		
	}
}
