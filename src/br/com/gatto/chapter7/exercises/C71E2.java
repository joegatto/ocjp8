package br.com.gatto.chapter7.exercises;

/**
 * 2. A resposta certa � (c). O c�digo j� compila pois a vari�vel n�o � final, e
 * entra em loop infinito.
 */
public class C71E2 {
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println(run);
		}
		System.out.println("finish");
	}
}
