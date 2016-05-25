package br.com.gatto.chapter9.exercises;


/**
 *6. A resposta certa é (a). Não compila pois tentamos invocar dois this.
 */
class C95E6 {
	public static void main(String[] args) {
		B95E6 b = new B95E6();
	}
}

class B95E6 {
	B95E6() {

	}

	B95E6(String s) {
		this();
//		this(s);
	}
}