package br.com.gatto.chapter7.exercises;

/**
 * 2. A resposta certa é (c). O código já compila pois a variável não é final, e
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
