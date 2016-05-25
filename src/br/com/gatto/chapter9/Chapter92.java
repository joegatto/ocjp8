package br.com.gatto.chapter9;

public class Chapter92 {
	public static void main(String[] args) {
		Car c = new Car();
		c.turnon(); // Car running!
		Vehicle v = new Car();
		v.turnon(); // Car running!
	}
}

class Vehicle {
	public void turnon() {
		System.out.println("Vehicle running!");
	}
}

class Car extends Vehicle {
	public void turnon() {
		System.out.println("Car running");
	}
}