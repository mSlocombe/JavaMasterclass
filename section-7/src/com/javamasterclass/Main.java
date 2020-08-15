package com.javamasterclass;

public class Main {

	// This project contains all chapters and exercises from Section 7 of the Java Masterclass course
	// https://www.udemy.com/course/java-the-complete-java-developer-course
    public static void main(String[] args) {
		// Chapter 90/91: Composition Part 1 & 2
//		compositionPartOneAndTwo();

		// Chapter 91: Composition Challenge
//		compositionChallenge();

		// Chapter 93: Encapsulation Challenge
//		encapsulationChallenge();

		// Chapter 94: Polymorphism
//		polymorphism();

		// Chapter95: Polymorphism Challenge
		polymorphismChallenge();
    }

    public static void polymorphismChallenge() {
    	// We are going to go back to the car analogy
		// Create a base class called Car
		// It should have a few fields that would be appropriate for a generic car class.
		// engine, cylinders, wheels, etc.
		// Constructor should initialise cylinders (number of) and name, and set wheels to 4
		// and engine to true. Cylinders and name would be passed parameters.
		//
		// Create appropriate getters
		//
		// Create some methods like startEngine, accelerate, and brake
		//
		// show a message for each in the base class
		// Now create 3 sub classes for your favourite vehicles.
		// Override the appropriate methods to demonstrate polymorphism in use.
		PolymorphismBaseClass baseClass = new FirstPolymorphedClass(5, "testClass");
		baseClass.thisIsAMethod();
		System.out.println(baseClass.getAnotherIntVariable());
	}

	public static void polymorphism() {
    	for(int i = 0; i < 10; i++) {
			Movie randomMovie = randomMovie();
			if (randomMovie != null) {
				System.out.println(randomMovie.getName());
				System.out.println(randomMovie.plot());
				System.out.println();
			}
		}
	}

	public static Movie randomMovie() {
    	int randomNumber = (int)(Math.random() * 5) + 1;
		System.out.println("Random number generated was: " + randomNumber);
		switch(randomNumber) {
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarWars();
			case 5:
				return new ForgettableMovie();
			default:
				return null;
		}
	}

    public static void encapsulationChallenge() {
    	// Create a class and demonstrate proper encapsulation techniques
		// the class will be called Printer
		// It will simulate a real Computer Printer
		// It should have fields for the toner level, number of pages printed, and
		// also whether its a duplex printer (capable of printing on both sides of the paper)
		// Add methods to fill up the toner (up to a maximum of 100%), another method to
		// simulate printing a page (which should increase the number of pages printed)
		// Decide on the scope, whether to use constructors, and anything else you think is needed.
		Printer myPrinter = new Printer(false);
		System.out.println(myPrinter.getTonerLevel());
		myPrinter.print(5);
		myPrinter.getStatus();
		myPrinter.print(95);
		myPrinter.getStatus();
		myPrinter.fillToner(50);
		myPrinter.getStatus();
		myPrinter.print(51);
		myPrinter.getStatus();

		Printer duplexPrinter = new Printer(true);
		duplexPrinter.getStatus();
		duplexPrinter.print(5);
		duplexPrinter.getStatus();
		duplexPrinter.print(95);
		duplexPrinter.getStatus();
		duplexPrinter.fillToner(50);
		duplexPrinter.getStatus();
		duplexPrinter.print(51);
		duplexPrinter.getStatus();
	}

    public static void compositionChallenge() {
    	// Create a single room of a house using composition.
		// Think about the things that should be included in the room.
		// Maybe physical parts of the house but furniture as well
		// Add at least one method to access an object via a getter and
		// then that objects public method as you saw in the previous video
		// then to access the object used in composition within the main class
		// like you saw in this video

		Room office = new Room(new Door(200, 500, 20), new LightFitting(new LightSwitch(20, 20, 10), new LightBulb("LED")), new Desk(50, 500, 500));
		office.getLight().pressSwitch();
		office.getDoor().openDoor();
		office.getDoor().openDoor();
	}

    public static void compositionPartOneAndTwo() {
    	Dimensions caseDimensions = new Dimensions(20, 20, 5);
		Case myCase = new Case("220B", "Acer", "240", caseDimensions);

		Monitor myMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

		Motherboard myMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		PC myPC = new PC(myCase, myMonitor, myMotherboard);
		myPC.powerUp();
	}
}
