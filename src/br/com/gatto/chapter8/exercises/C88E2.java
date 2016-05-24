package br.com.gatto.chapter8.exercises;

/**
 * 2. A resposta certa é (c). Compila e imprime 151.
 */
public class C88E2 {
	public static void main(String[] args) {
		int i = 150;
		// i = ++s(i);
		System.out.println(i);
	}

	static int s(int i) {
		return ++i;
	}
}
