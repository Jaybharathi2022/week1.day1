package week1.day1.assignment;

public class Car {

	int regNum = 1234;

	public void startCar() {

		System.out.println("Starting car");
	}

	public void applyBrake() {

		System.out.println("Apply brake");
	}

	public void applyGear() {

		System.out.println("Applying gear");
	}

	public void switcOnAc() {

		System.out.println("Switch on AC");
	}

	public void applyAccelerate() {

		System.out.println("Accelerating");
	}

	public static void main(String[] args) {

		System.out.println("Main method");

		Car myCar = new Car();
		myCar.startCar();
		myCar.switcOnAc();
		myCar.applyGear();
		myCar.applyAccelerate();
		myCar.applyBrake();

	}
}
