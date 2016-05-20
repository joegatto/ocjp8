package br.com.gatto.chapter5.exercises;

import br.com.gatto.chapter5.Car;

/**
 * 3. A resposta certa � (d). Mesmo c sendo null, por estarmos usando o operador
 * &, a segunda parte da express�o ( c.getPreco() > 10000) ser� avaliada,
 * causando uma NullPointerException na chamada do m�todo getPreco() caso c seja
 * null. Poder�amos evitar isso usando o operador de curto-circuito, &&.
 */
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
