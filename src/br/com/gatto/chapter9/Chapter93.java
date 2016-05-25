package br.com.gatto.chapter9;

public class Chapter93 {
	void method(Vehicle v) {

	}

	void method() {
		method(new Car());
		method(new Motorcycle());
		method(new Bus());
		method(new Vehicle());
		method(new HybridCar());
	}
}

class Motorcycle extends Vehicle {
}

class Bus extends Vehicle {
}

class HybridCar extends Car {
}