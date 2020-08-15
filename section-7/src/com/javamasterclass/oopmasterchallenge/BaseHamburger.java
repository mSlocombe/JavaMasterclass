package com.javamasterclass.oopmasterchallenge;

import java.sql.Struct;
import java.util.HashMap;

public class BaseHamburger {
	// The basic hamburger should have the following items.
	// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
	// the customer can select to be added to the burger.
	// Each one of these items gets charged an additional price so you need some way to track how many items got added
	// and to calculate the final price (base burger with all the additions).
	// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
	// Create a Hamburger class to deal with all the above.
	// The constructor should only include the roll type, meat and price, can also include name of burger or you
	// can use a setter.
	private String burgerName;
	private String breadType;
	private boolean meat;
	private boolean lettuce;
	private boolean tomato;
	private boolean carrot;
	private boolean sauce;

	private double meatPrice;
	private double lettucePrice;
	private double tomatoPrice;
	private double carrotPrice;
	private double saucePrice;

	private double basePrice;

	public BaseHamburger(String burgerName, String breadType, boolean meat, double basePrice) {
		this.burgerName = burgerName;
		this.breadType = breadType;
		this.meat = meat;
		this.basePrice = basePrice;
		this.meatPrice = 5.00d;
		this.lettucePrice = 2.00d;
		this.tomatoPrice = 2.00d;
		this.carrotPrice = 2.00d;
		this.saucePrice = 0.5d;
	}

	public String getBurgerName() {
		return burgerName;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void addMeat() {
		meat = true;
	}

	public void addLettuce() {
		lettuce = true;
	}

	public void addTomato() {
		tomato = true;
	}

	public void addCarrot() {
		carrot = true;
	}

	public void addSauce() {
		sauce = true;
	}

	public void removeMeat() {
		meat = false;
	}

	public void removeLettuce() {
		lettuce = false;
	}

	public void removeTomato() {
		tomato = false;
	}

	public void removeCarrot() {
		carrot = false;
	}

	public void removeSauce() {
		sauce = false;
	}

	public double calculatePrice() {
		double totalPrice = basePrice;
		if(meat) {
			totalPrice += meatPrice;
		}
		if(lettuce) {
			totalPrice += lettucePrice;
		}
		if(tomato) {
			totalPrice += tomatoPrice;
		}
		if(carrot) {
			totalPrice += carrotPrice;
		}
		if(sauce) {
			totalPrice += saucePrice;
		}
		return totalPrice;
	}
}