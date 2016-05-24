package br.com.gatto.chapter8.exercises;

/**
 * 2. A resposta certa é (b). Compila e imprime 3.
 */
public class C86E2 {
	private static int a(int b) {
		return b(b) - 1;
	}

	private static int b(int b) {
		return b - 1;
	}

	public static void main(String[] args) {
		System.out.println(new C86E2().a(5));
	}
}
