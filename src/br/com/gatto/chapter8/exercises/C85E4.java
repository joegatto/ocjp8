package br.com.gatto.chapter8.exercises;

/**
 * 4. A resposta certa é (f). O código compila e não imprime nada.
 */
class B85E4 {

	B85E4(C85E4 a) {
	}

	B85E4() {
	}
}

class A85E4 {

	A85E4(B85E4 b) {
	}

	A85E4() {
	}
}

class C85E4 {
	public static void main(String[] args) {
		new A85E4(new B85E4(new C85E4()));
	}
}
