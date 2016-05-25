package br.com.gatto.chapter9.exercises;

/**
 * 4. A resposta certa é (b). Compila e imprime 1.
 */
public class C93E4 {
	public static void main(String[] args) {
		new D93E4().y(new A93E4());
	}
}

class D93E4 extends A93E4 {
	void x() {
		System.out.println(1);
	}

	void y(A93E4 c) {
		x();
	}
}

class A93E4 extends B93E4 {
	void x() {
		System.out.println(2);
	}
}

class B93E4 {
	void x() {
		System.out.println(3);
	}

	void y(B93E4 b) {
		b.x();
	}
}