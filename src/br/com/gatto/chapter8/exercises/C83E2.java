package br.com.gatto.chapter8.exercises;

/**
 * 2. A resposta certa é (c). Compila e imprime 15, 15 e 15.0.
 */
public class C83E2 {
	public static void main(String[] args) {
		int x = b(15);
		System.out.println(x);
		System.out.println(15);
		System.out.println(15.0);
	}

	static int b(int i) {
		return i;
	}

	static double b(double i) {
		return i;
	}
}
