package com.javamasterclass;

public class PolymorphismBaseClass {
	private int intVariable;
	private String name;
	private int anotherIntVariable;
	private boolean booleanVariable;

	public PolymorphismBaseClass(int intVariable, String name) {
		this.intVariable = intVariable;
		this.name = name;
		anotherIntVariable = 4;
		booleanVariable = true;
	}

	public int getIntVariable() {
		System.out.println("base class getIntVariable");
		return intVariable;
	}

	public String getName() {
		System.out.println("base class getName");
		return name;
	}

	public int getAnotherIntVariable() {
		System.out.println("base class getAnotherIntVariable");
		return anotherIntVariable;
	}

	public boolean isBooleanVariable() {
		System.out.println("base class isBooleanVariable");
		return booleanVariable;
	}

	public void thisIsAMethod() {
		System.out.println("base class thisIsAMethod");
	}
}
