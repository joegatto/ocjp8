package br.com.gatto.chapter9.exercises;

/**
 * 9. O código compila normalmente. Apesar de o método turnon não estar
 * declarado na classe ConcreteCar, a classe herda estemétodo de Car, logo, não
 * é necessário reescrevê-lo (poderia reescrever se achasse necessário). A
 * declaração de que ConcreteCar implementa Vehicle também não era necessária,
 * pois Car já implementa Vehicle e ConcreteCar é um Car.
 */
public class C93E9 {

}

interface Vehicle {
	int getSpeed();

	void turnon();
}

abstract class Car implements Vehicle {
	public void turnon() {
		System.out.println("on!");
	}
}

class ConcreteCar extends Car implements Vehicle {
	public int getSpeed() {
		return 1;
	}
}
