package br.com.gatto.chapter8.exercises;

/**
 * 8. A resposta certa é (b). Compila e imprime 1.
 */
public class C83E8 {
	static int a(D3 d, B3 b2) {
		return 1;
	}

	static int a(C3 c, C3 c2) {
		return 2;
	}

	static int a(B3 b, B3 b2) {
		return 3;
	}

	static int a(C83E8 a, C83E8 a2) {
		return 4;
	}

	public static void main(String[] args) {
		System.out.println(a(new D3(), new D3()));
	}
}
