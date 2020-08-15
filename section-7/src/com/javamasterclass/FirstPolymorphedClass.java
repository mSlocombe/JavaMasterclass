package com.javamasterclass;

public class FirstPolymorphedClass extends PolymorphismBaseClass {
	public FirstPolymorphedClass(int intVariable, String name) {
		super(intVariable, name);
	}

	@Override
	public void thisIsAMethod() {
		System.out.println("FirstPolymorphedClass thisIsAMethod");
	}
}
