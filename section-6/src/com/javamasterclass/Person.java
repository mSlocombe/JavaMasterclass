package com.javamasterclass;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String name) {
		firstName = name;
	}

	public void setLastName(String name) {
		lastName = name;
	}

	public void setAge(int age) {
		if(age < 0 || age > 100) {
			this.age = 0;
		}
		else {
			this.age = age;
		}
	}

	public boolean isTeen() {
		return (age >= 13 && age <= 19);
	}

	public String getFullName() {
		if(firstName.isEmpty() && lastName.isEmpty()) {
			return "";
		}
		else if(firstName.isEmpty()) {
			return lastName;
		}
		else if(lastName.isEmpty()) {
			return firstName;
		}
		else {
			return firstName + " " + lastName;
		}
	}
}
