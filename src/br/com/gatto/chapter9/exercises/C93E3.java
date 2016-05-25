package br.com.gatto.chapter9.exercises;

/**
 * 3. A resposta certa é (c). Compila e imprime 2.
 */
public class C93E3 {
	public static void main(String[] args) {
		new B93E3().y(new A93E3());
	}
}

class D93E3 extends A93E3 {
	void x() {
		System.out.println(1);
	}

	void y(A93E3 c) {
		x();
	}
}

class A93E3 extends B93E3 {
	void x() {
		System.out.println(2);
	}
}

class B93E3 {
	void x() {
		System.out.println(3);
	}

	void y(B93E3 b) {
		b.x();
	}
}