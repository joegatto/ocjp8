package br.com.gatto.chapter8.exercises;

/**
 * 6. A resposta certa é (b). Compila e imprime 1.
 */
class C83E6 {
	static int a(D3 d) {
		return 1;
	}

	static int a(C3 c) {
		return 2;
	}

	static int a(B3 b) {
		return 3;
	}

	static int a(C83E6 a) {
		return 4;
	}

	public static void main(String[] args) {
		System.out.println(a(new D3()));
	}
}
