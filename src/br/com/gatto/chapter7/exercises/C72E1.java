package br.com.gatto.chapter7.exercises;

/**
 * 1. A resposta certa � (a). O c�digo n�o compila, pois o la�o nunca � quebrado
 * e nunca chega a executar o c�digo que imprime b.
 */
public class C72E1 {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("a");
		}
		// System.out.println("b");
	}
}
