package br.com.gatto.chapter8;

public class Chapter82 {
	public static void main(String[] args) {
		int total = Car.getTotalCars();
		System.out.println(total);

		Car c = new Car();
		int i = c.getTotalCars();

		A a1 = new A();
		a1.method();

		B b1 = new B();
		b1.method();

		A a2 = b1;
		a2.method();
	}

	static int b = getMethod();

	public static int getMethod() {
		return a;
	}

	static int a = 15;

	static int another;

	static void inicializa() {
		another = 10;
	}
	
	static int one = another + 1;
}

class A {
	static void a() {

	}

	// void a() {
	//
	// }

	static void method() {
		System.out.println("a");
	}
}

class B extends A {
	static void a() {

	}

	static void method() {
		System.out.println("b");
	}
}

class C extends B {

	// void a() {
	//
	// }
}
