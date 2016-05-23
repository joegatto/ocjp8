package br.com.gatto.chapter8.exercises;

/**
 * 5. A resposta certa é (b). O código compila e imprime x e y
 */
public class C82E5 extends B2 {
	public static void main(String[] args) {
		x();
		C82E5.y();
	}
}

class B2 {
	static void x() {
		System.out.println("x");
	}

	static void y() {
		System.out.println("y");
	}
}
