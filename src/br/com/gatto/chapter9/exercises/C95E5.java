package br.com.gatto.chapter9.exercises;

/**
 * 5. A resposta certa é (a). O código não compila, não podemos chamar o this()
 * de dentro de um método
 */
class C95E5 {
	public static void main(String[] args) {
		B95E5 b = new B95E5();
	}
}

class B95E5 {
	void B95E5() {

	}

	void B95E5(String s) {
		// this();
		// this(s);
	}
}