package br.com.gatto.chapter5.exercises;

/**
 * 6. 1� linha: ArithmeticException: / by zero 2� linha: Infinity 3� linha:
 * Infinity 4� linha: -Infinity
 */
public class C51E6 {
	public static void main(String[] args) {
		// System.out.println(3 / 0);
		System.out.println(3 / 0.0);
		System.out.println(3.0 / 0);
		System.out.println(-3.0 / 0);
	}
}
