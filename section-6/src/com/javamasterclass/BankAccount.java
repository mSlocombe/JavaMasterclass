package com.javamasterclass;

public class BankAccount {
	private long accountNumber;
	private double balance;
	private String customerName;
	private String emailAddress;
	private String phoneNumber;

	public BankAccount() {
		this(-1, 0d, "", "", "");
		System.out.println("Empty constructor call");
	}

	public BankAccount(long accountNumber, double balance, String customerName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
	}

	public BankAccount(long accountNumber, double startingBalance, String name, String emailAddress, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = startingBalance;
		this.customerName = name;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}

	public void depositFunds(long amount) {
		if(amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("Unable to deposit " + amount);
		}
	}

	public void withdrawFunds(long amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
		else {
			System.out.println("Unable to withdraw " + amount);
		}
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
