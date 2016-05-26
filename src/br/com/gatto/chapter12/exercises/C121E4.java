package br.com.gatto.chapter12.exercises;

/**
 * 4. A resposta certa é (b). Erro de compilação na linha B.
 */
public class C121E4 {

	static long i;

	public static void main(String[] args) {
		i = Integer.parseInt("10", 8);
		// m1(i + 1);
	}

	private static void m1(Integer j) {
		System.out.println(j);
	}
}
