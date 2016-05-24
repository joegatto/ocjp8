package br.com.gatto.chapter8.exercises;


class B85E5 {

	B85E5(C85E5 c) {
		new A85E5();
	}

	B85E5() {
		new A85E5(this);
	}
}

class A85E5 {

	A85E5(B85E5 b) {
		new B85E5(new C85E5());
	}

	A85E5() {
		new B85E5();
	}
}

/**
 * 5. A resposta certa é (e). O código compila e joga exception ao entrar em
loop infinito.
 */
class C85E5 {
	public static void main(String[] args) {
		new A85E5(new B85E5(new C85E5()));
	}
}
