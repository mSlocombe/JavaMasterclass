package com.javamasterclass;

public class Printer {
	// Create a class and demonstrate proper encapsulation techniques
	// the class will be called Printer
	// It will simulate a real Computer Printer
	// It should have fields for the toner level, number of pages printed, and
	// also whether its a duplex printer (capable of printing on both sides of the paper)
	// Add methods to fill up the toner (up to a maximum of 100%), another method to
	// simulate printing a page (which should increase the number of pages printed)
	// Decide on the scope, whether to use constructors, and anything else you think is needed.

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(boolean duplex) {
		this.tonerLevel = 100;
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}

	public void getStatus() {
		System.out.println("I have printed " + pagesPrinted + " pages and have " + tonerLevel + "% toner left");
	}

	public void fillToner(int amount) {
		if(tonerLevel + amount > 100) {
			tonerLevel = 100;
		}
		else {
			tonerLevel += amount;
		}
	}

	public void print(int pages) {
		int requiredInk = pages;
		if(duplex) {
			pages = (int)Math.ceil(pages / 2);
		}
		if(tonerLevel >= requiredInk) {
			tonerLevel -= requiredInk;
			pagesPrinted += pages;
		}
		else {
			System.out.println("Toner level too low, please fill");
		}
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return duplex;
	}
}
