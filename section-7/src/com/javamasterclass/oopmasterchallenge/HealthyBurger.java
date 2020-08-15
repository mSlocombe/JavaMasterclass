package com.javamasterclass.oopmasterchallenge;

public class HealthyBurger extends BaseHamburger {
	// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
	// The healthy burger can have 6 items (Additions) in total.
	// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
	// not the base class (Hamburger), since the two additions are only appropriate for this new class
	// (in other words new burger type).
	private boolean cabbage;
	private boolean gherkin;

	private double cabbagePrice;
	private double gherkinPrice;

	public HealthyBurger(String burgerName, boolean meat, double basePrice) {
		super(burgerName, "Brown Rye Bread Roll", meat, basePrice);
		cabbagePrice = 2.00d;
		gherkinPrice = 2.00d;
	}

	public void addCabbage() {
		cabbage = true;
	}

	public void removeCabbage() {
		cabbage = false;
	}

	public void addGherkin() {
		gherkin = true;
	}

	public void removeGherkin() {
		gherkin = false;
	}

	@Override
	public double calculatePrice() {
		System.out.println("Calculating " + getBurgerName() + " price, base price: " + getBasePrice());
		double totalPrice = super.calculatePrice();
		if(cabbage) {
			totalPrice += cabbagePrice;
			System.out.println(" + cabbage: " + totalPrice);
		}
		if(gherkin) {
			totalPrice += gherkinPrice;
			System.out.println(" + gherkin: " + totalPrice);
		}
		return totalPrice;
	}
}
