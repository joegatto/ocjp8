package br.com.gatto.chapter7.exercises;

/**
 * 1. A resposta certa é (a). O código não compila, pois o laço nunca é quebrado
 * e nunca chega a executar o código que imprime b.
 */
public class C72E1 {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("a");
		}
		// System.out.println("b");
	}
}
