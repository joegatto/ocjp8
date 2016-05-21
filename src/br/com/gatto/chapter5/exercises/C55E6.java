package br.com.gatto.chapter5.exercises;

/**
 * 6. A resposta certa é (a). O código não compila pois há código que não será
 * executado após break.
 */
public class C55E6 {
	public static void main(String[] args) {
		switch (10) {
		case 10:
			System.out.println("a");
			break;
		// System.out.println("b");
		default:
			System.out.println("c");
		case 11:
			System.out.println("d");
		}
	}
}
