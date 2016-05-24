package br.com.gatto.chapter8.exercises;

/**
 * 4. A resposta certa é (a). Não compila: os métodos não são estáticos.
 */
class C83E4 {
	int a(D3 d) {
		return 1;
	}

	int a(C3 c) {
		return 2;
	}

	int a(B3 b) {
		return 3;
	}

	int a(C83E4 a) {
		return 4;
	}

	public static void main(String[] args) {
		// System.out.println(a(new D3()));
	}
}

class B3 {

}

class C3 {

}

class D3 extends B3 {

}
