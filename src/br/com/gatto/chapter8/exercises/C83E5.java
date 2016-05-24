package br.com.gatto.chapter8.exercises;

/**
 * 5. A resposta certa é (d). O código não compila. O método a não é estático.
 */
class C83E5 {
	int a(D3 d) {
		return 1;
	}

	static int a(C3 c) {
		return 2;
	}

	static int a(B3 b) {
		return 3;
	}

	static int a(C83E5 a) {
		return 4;
	}

	public static void main(String[] args) {
		// System.out.println(a(new D3()));
	}
}
