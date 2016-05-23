package br.com.gatto.chapter8.exercises;

/**
 * 4. A resposta certa é (a). O código não compila pois tenta acessar this
 * dentro de um contexto estático.
 */
public class C82E4 extends B1 {
	public static void main(String[] args) {
		// this.x();
		C82E4.y();
	}
}

class B1 {
	static void x() {
		System.out.println("x");
	}

	static void y() {
		System.out.println("y");
	}
}
