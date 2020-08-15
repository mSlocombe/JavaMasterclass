package com.javamasterclass.oopmasterchallenge;

public class DeluxeBurger extends BaseHamburger {
	// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
	// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
	// object is created, and then prevent other additions being made.
	private final boolean chips = true;
	private final boolean drinks = true;

	private double chipsPrice;
	private double drinksPrice;
	public DeluxeBurger(String burgerName, String breadType, boolean meat, double basePrice) {
		super(burgerName, breadType, meat, basePrice);
		chipsPrice = 10d;
		drinksPrice = 10d;
	}

	@Override
	public double calculatePrice() {
		System.out.println("Calculating deluxe burger price");
		System.out.println("Base price: " + getBasePrice());
		double totalPrice = super.calculatePrice();
		totalPrice += (chipsPrice + drinksPrice);
		System.out.println("+ chips & drink: " + totalPrice);
		return totalPrice;
	}
}
