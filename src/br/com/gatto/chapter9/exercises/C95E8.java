package br.com.gatto.chapter9.exercises;

/**
 * 8. A resposta certa é (c). Compila e não imprime nada.
 */
class C95E8 {
	public static void main(String[] args) {
		String s = null;
		B95E8 b = new B95E8(s);
	}
}

class B95E8 {
	B95E8() {

	}

	B95E8(String s) {
		this();
	}
}