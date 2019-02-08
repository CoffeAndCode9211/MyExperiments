package org.learn.java.designpattern.builder;

public class Main {
	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount.BankAccountBuilder("Test", "123456")
			.withEmail("test@gmail.com")
			.withLetter(true)
			.build();
		
		
		System.out.println(bank.toString());
	}
}
