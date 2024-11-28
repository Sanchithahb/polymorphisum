package rtp;

public class Vehicle {
	void start() {
		System.out.println("vehicle started");
	}
}
class Car extends Vehicle{
	void start() {
		System.out.println("car started");
	}
}
class Bike extends Vehicle{
	void start() {
		System.out.println("bike started");
	}
}


