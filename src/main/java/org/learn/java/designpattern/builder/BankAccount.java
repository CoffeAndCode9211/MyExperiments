package org.learn.java.designpattern.builder;

public class BankAccount {

	private String name;
	private String accountNumber;
	private String email;
	private boolean newsletter;

	private BankAccount() {

	}

	private BankAccount(BankAccountBuilder builder) {
		this.name = builder.name;
		this.accountNumber = builder.accountNumber;
		this.email = builder.email;
		this.newsletter = builder.newsletter;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber
				+ ", email=" + email + ", newsletter=" + newsletter + "]";
	}

	public static class BankAccountBuilder {

		private String name;
		private String accountNumber;
		private String email;
		private boolean newsletter;

		public BankAccountBuilder(String name, String accountNo) {
			this.name = name;
			this.accountNumber = accountNo;
		}

		public BankAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public BankAccountBuilder withLetter(boolean newsletter) {
			this.newsletter = newsletter;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}
	}

}
