package br.com.gatto.chapter9.exercises;

/**
 * 2. A resposta certa é (c). Compila e imprime 2.
 */
public class C93E2 {
	public static void main(String[] args) {
		new B93E2().y(new A93E2());
	}
}

class D93E2 extends A93E2 {
	void x() {
		System.out.println(1);
	}
}

class A93E2 extends B93E2 {
	void x() {
		System.out.println(2);
	}
}

class B93E2 {
	void x() {
		System.out.println(3);
	}

	void y(B93E2 b) {
		b.x();
	}

	void y(A93E2 c) {
		c.x();
	}

	void y(D93E2 d) {
		d.x();
	}
}