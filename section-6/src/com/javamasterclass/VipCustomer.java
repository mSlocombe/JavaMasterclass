package com.javamasterclass;

public class VipCustomer {
	private String name;
	private String emailAddress;
	private double creditLimit;

	public VipCustomer() {
		this("", "", 0d);
	}

	public VipCustomer(String name, String emailAddress) {
		this(name, emailAddress, 0d);
	}

	public VipCustomer(String name, String emailAddress, double creditLimit) {
		this.name = name;
		this.emailAddress = emailAddress;
		this.creditLimit = creditLimit;
	}

	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		return "VipCustomer{" +
				"name='" + name + '\'' +
				", emailAddress='" + emailAddress + '\'' +
				", creditLimit=" + creditLimit +
				'}';
	}
}
