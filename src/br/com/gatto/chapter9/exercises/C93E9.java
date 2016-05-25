package br.com.gatto.chapter9.exercises;

/**
 * 9. O c�digo compila normalmente. Apesar de o m�todo turnon n�o estar
 * declarado na classe ConcreteCar, a classe herda estem�todo de Car, logo, n�o
 * � necess�rio reescrev�-lo (poderia reescrever se achasse necess�rio). A
 * declara��o de que ConcreteCar implementa Vehicle tamb�m n�o era necess�ria,
 * pois Car j� implementa Vehicle e ConcreteCar � um Car.
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
