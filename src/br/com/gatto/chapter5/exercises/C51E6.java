package br.com.gatto.chapter5.exercises;

/**
 * 6. 1ª linha: ArithmeticException: / by zero 2ª linha: Infinity 3ª linha:
 * Infinity 4ª linha: -Infinity
 */
public class C51E6 {
	public static void main(String[] args) {
		// System.out.println(3 / 0);
		System.out.println(3 / 0.0);
		System.out.println(3.0 / 0);
		System.out.println(-3.0 / 0);
	}
}
