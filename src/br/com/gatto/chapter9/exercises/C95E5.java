package br.com.gatto.chapter9.exercises;

/**
 * 5. A resposta certa � (a). O c�digo n�o compila, n�o podemos chamar o this()
 * de dentro de um m�todo
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