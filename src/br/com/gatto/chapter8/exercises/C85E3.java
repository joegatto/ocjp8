package br.com.gatto.chapter8.exercises;

class B85E3 {

	B85E3(C85E3 a) {
	}

	B85E3() {
	}
}

class A85E3 {

	A85E3(B85E3 b) {
	}

	A85E3() {
	}
}

/**
 * 3. A resposta certa é (f). O código compila e não imprime nada.
 */
class C85E3 {
	public static void main(String[] args) {
		new C85E3();
		new B85E3();
		new A85E3();
	}
}
