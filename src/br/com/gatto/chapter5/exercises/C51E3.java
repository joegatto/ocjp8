package br.com.gatto.chapter5.exercises;

import br.com.gatto.chapter5.Car;

public class C51E3 {
	public static void main(String[] args) {
		Car car = null;
		new C51E3().method(car);
	}

	void method(Car c) {
		if (c != null && c.getPreco() > 100000) {
			System.out.println("Expensive");
		}
	}
}
