package br.com.gatto.chapter3.exercises;

/**
 * 3. A resposta certa � (c). A vari�vel i declarada no for s� � vis�vel dentro
 * do for.
 */

public class C31E3 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		int i = 15;
		System.out.println(i);
	}
}
