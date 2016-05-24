package br.com.gatto.chapter8.exercises;


class B85E2// ()
{

	B85E2(C85E2 a) {
	}

	B85E2() {
	}
}

class A85E2// ()
{

	A85E2(B85E2 b) {
	}

	A85E2() {
	}
}

/**
 * 2. A resposta certa é (d). O código não compila pois as classes definem
parênteses a mais. Cuidado.
 */
class C85E2 {
	public static void main(String[] args) {
		new C85E2();
		new B85E2();
		new A85E2();
	}
}
