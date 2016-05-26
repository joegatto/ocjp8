package br.com.gatto.chapter12.exercises;

/**
 * 3. A resposta certa é (d). Imprime 11.
 */
public class C121E3 {

	static int i;

	public static void main(String[] args) {
		i = Integer.parseInt("10");
		m1(i + 1);
	}

	private static void m1(Integer j) {
		System.out.println(j);
	}
}
