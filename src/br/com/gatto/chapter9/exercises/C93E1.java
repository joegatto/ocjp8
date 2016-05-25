package br.com.gatto.chapter9.exercises;

/**
 * 1. A resposta certa é (a). Não compila pois há um erro de copy e paste nos
 * nomes das variáveis.
 */
public class C93E1 {
	public static void main(String[] args) {
		new B93E1().y(new A93E1());
	}
}

class D93E1 extends A93E1 {
	void x() {
		System.out.println(1);
	}
}

class A93E1 extends B93E1 {
	void x() {
		System.out.println(2);
	}
}

class B93E1 {
	void x() {
		System.out.println(3);
	}

	void y(B93E1 b) {
		b.x();
	}

	void y(A93E1 b) {
		// c.x();
	}

	void y(D93E1 b) {
		// d.x();
	}
}