package com.javamasterclass;

public class Main {

    public static void main(String[] args) {
    	// Section 6 - Chapter 76/77 (Classes Part 1 + 2)
//		classesPartOneAndTwo();

		// Section 6 - Exercise 29: Sum Calculator
//		sumCalculator();

		// Section 6 - Exercise 30: Person
//		person();

		// Section 6 - Chapter 78 Classes Challenge
//		classesChallenge();

		// Section 6 - Chapter 78 Constructors
//		constructors();

		// Section 6 - Chapter 78 Constructors challenge
//		constructorsChallenge();

		// Section 6 - Exercise 31: Wall Area
//		wallArea();

		// Section 6 - Exercise 32: Point
//		point();

		// Section 6 - Exercise 33: Carpet Cost Calculator
		//carpetCostCalculator();

		// Section 6 - Exercise 34: Complex Operations
//		complexOperations();

		// Section 6 - Chapter 80/81: Inheritance - Part 1 & 2
//		inheritancePartOneAndTwo();

    	// Section 6 - Chapter 87/88: Inheritance Challenge Part 1 & 2
//		inheritanceChallengePartOneAndTwo();

		// Section 6 - Exercise 35: Cylinder
//		cylinder();

		// Section 6 - Exercise 36: Pool Area
		poolArea();
    }

    public static void poolArea() {
    	Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width = " + rectangle.getWidth());
		System.out.println("rectangle.length = " + rectangle.getLength());
		System.out.println("rectangle.area = " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width = " + cuboid.getWidth());
		System.out.println("cuboid.length = " + cuboid.getLength());
		System.out.println("cuboid.area = " + cuboid.getArea());
		System.out.println("cuboid.height = " + cuboid.getHeight());
		System.out.println("cuboid.volume = " + cuboid.getVolume());
	}

    public static void cylinder() {
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius = " + circle.getRadius());
		System.out.println("circle.area = " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius = " + cylinder.getRadius());
		System.out.println("cylinder.height = " + cylinder.getHeight());
		System.out.println("cylinder.area = " + cylinder.getArea());
		System.out.println("cylinder.volume = " + cylinder.getVolume());
	}

    public static void inheritanceChallengePartOneAndTwo() {
    	//Challenge.
		// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
		// Finally, create another class, a specific type of Car that inherits from the Car class.
		// You should be able to handle steering, changing gears, and moving (speed in other words).
		// You will want to decide where to put the appropriate state and behaviours (fields and methods).
		// As mentioned above, changing gears, increasing/decreasing speed should be included.
		// For your specific type of vehicle you will want to add something specific for that type of car.
		SpecificCar outlander = new SpecificCar(36);
		outlander.steer(45);
		outlander.accelerate(30);
		outlander.accelerate(20);
		outlander.accelerate(-42);
	}

	public static void inheritancePartOneAndTwo() {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
		dog.eat();
//		dog.walk();
		dog.run();
	}

	public static void complexOperations() {
		ComplexNumber one = new ComplexNumber(1d, 1d);
		ComplexNumber number = new ComplexNumber(2.5d, -1.5d);
		one.add(1,1);
		System.out.println("one.real = " + one.getReal());
		System.out.println("one.imaginary = " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real = " + one.getReal());
		System.out.println("one.imaginary = " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real = " + number.getReal());
		System.out.println("number.imaginary = " + number.getImaginary());
	}

	public static void carpetCostCalculator() {
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("Total = " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("Total = " + calculator.getTotalCost());
	}

	public static void point() {
    	Point first = new Point(6,5);
    	Point second = new Point(3,1);
		System.out.println("Distance(0,0) = " + first.distance());
		System.out.println("Distance(second) = " + first.distance(second));
		System.out.println("Distance(2,2) = " + first.distance(2,2));
		Point point = new Point();
		System.out.println("Distance() = " + point.distance());
	}

	public static void wallArea() {
    	Wall wall = new Wall(5,4);
		System.out.println("Area = " + wall.getArea());

		wall.setHeight(-1.5);
		System.out.println("Width = " + wall.getWidth());
		System.out.println("Height = " + wall.getHeight());
		System.out.println("Area = " + wall.getArea());
	}

	public static void constructorsChallenge() {
    	// Create a new class VipCustomer
		// it should have 3 fields name, credit limit and email address.
		// create 3 constructors
		// 1st constructor empty should call the constructor with 3 parameters with default values
		// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
		// 3rd constructor should save all fields
		// create getters only for this using code generation of intellij as setters wont be needed
		// test and confirm it works
		VipCustomer firstCustomer = new VipCustomer();
		VipCustomer secondCustomer = new VipCustomer("John Smith", "jsmith@gmail.com");
		VipCustomer thirdCustomer = new VipCustomer("Jack Smith", "jacksmith@gmail.com", 50000d);

		System.out.println(firstCustomer.toString());
		System.out.println(secondCustomer.toString());
		System.out.println(thirdCustomer.toString());
	}

	public static void constructors() {
    	BankAccount account = new BankAccount(43284903, 50d, "Jack Smith", "jacksmith@gmail.com", "+44594343");
		System.out.println(account.getAccountNumber());
		System.out.println(account.getBalance());
		System.out.println(account.getCustomerName());
		System.out.println(account.getEmailAddress());
		System.out.println(account.getPhoneNumber());

		BankAccount testAccount = new BankAccount();
		System.out.println(testAccount.getAccountNumber());
	}

	public static void classesChallenge() {
    	// Create a new class for a bank account
		// Create fields for the account number, balance, customer name, email and phone number.
		//
		// Create getters and setters for each field
		// Create two additional methods
		// 1. To allow the customer to deposit funds (this should increment the balance field).
		// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
		// but not allow the withdrawal to complete if there are insufficient funds.
		// You will want to create various code in the Main class (the one create by IntelliJ) to
		// confirm your code is working.
		// Add some System.out.println's in the two methods above as well.
		BankAccount account = new BankAccount();
		account.setAccountNumber(6483291);
		System.out.println("account number: " + account.getAccountNumber());
		account.setBalance(47382);
		System.out.println("starting balance: " + account.getBalance());
		account.setCustomerName("John Smith");
		System.out.println("Name: " + account.getCustomerName());
		account.setEmailAddress("jsmith@gmail.com");
		System.out.println("Email: " + account.getEmailAddress());
		account.setPhoneNumber("+4479439483");
		System.out.println("Phone number: " + account.getPhoneNumber());
		System.out.println("before deposit: " + account.getBalance());
		account.depositFunds(1000);
		System.out.println("after deposit: " + account.getBalance());
		account.depositFunds(-413);
		account.withdrawFunds(500);
		System.out.println("after withdraw: " + account.getBalance());
		account.withdrawFunds(-500);
		account.withdrawFunds(Long.MAX_VALUE);
	}

	public static void classesPartOneAndTwo() {
    	// NOTE: deprecated by Chapter 87/88 which uses the Car class
//    	Car porsche = new Car();
//		Car holden = new Car();
//		porsche.setModel("Carrera");
//		System.out.println(porsche.getModel());
	}

	public static void sumCalculator() {
    	SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5d);
		calculator.setSecondNumber(4);
		System.out.println("add = " + calculator.getAdditionResult());
		System.out.println("subtract = " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25d);
		calculator.setSecondNumber(0);
		System.out.println("multiply = " + calculator.getMultiplicationResult());
		System.out.println("divide = " + calculator.getDivisionResult());
	}

	public static void person() {
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		person.setFirstName("John");
		person.setAge(18);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		person.setLastName("Smith");
		System.out.println("Full name = " + person.getFullName());
	}
}