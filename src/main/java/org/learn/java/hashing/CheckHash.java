package org.learn.java.hashing;

public class CheckHash {

	public static void main(String[] args) {
		
		System.out.println("2 User Object with same Data have different Hashcode");
		UserTO user1 = new UserTO("Ashish", "Test", "123", "1");
		System.out.println("User1 Hashcode: "+user1.hashCode());
		
		UserTO user2 = new UserTO("Ashish", "Test", "123", "1");
		System.out.println("User2 Hashcode: "+user2.hashCode());
		if(user1.equals(user2)){ // checks if they both referring to same object
			System.out.println("Both objects are equal");
		}
		
		System.out.println("\n2 User Object with same Data have same Hashcode when equals and hashcode implemented");
		UserWithHashTO user3 = new UserWithHashTO("Ashish", "Test", "123", 1, false);
		System.out.println("User3 Hashcode: "+user3.hashCode());
		
		UserWithHashTO user4 = new UserWithHashTO("Ashish", "Test", "123", 1, false);
		System.out.println("User4 Hashcode: "+user4.hashCode());
		
		if(user3.equals(user4)){
			System.out.println("Both objects are equal");
		}
		
		
		
		String a = new String("a");
		String b = new String("a");
		System.out.println("a Hashcode: "+a.hashCode());
		System.out.println("b Hashcode: "+b.hashCode());
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		
		a = "bb";
		b = "bb";
		System.out.println("a Hashcode: "+a.hashCode());
		System.out.println("b Hashcode: "+b.hashCode());
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}

