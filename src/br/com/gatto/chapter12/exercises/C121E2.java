package br.com.gatto.chapter12.exercises;

/**
 * 2. A resposta certa é (c). Imprime 10.
 */
public class C121E2 {

	static int i;

	public static void main(String[] args) {
		i = Integer.parseInt("10");
		m1(i + 1);
	}

	private static void m1(Integer j) {
		System.out.println(i);
	}
}
