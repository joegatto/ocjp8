package br.com.gatto.chapter8.exercises;

import br.com.gatto.chapter8.exercises.a.A;

/**
 * 5. A resposta certa é (b). Imprime 1, pois o método que recebe String não
 * está visível no pacote principal.
 *
 */
class C86E5 {
	public static void main(String[] args) {
		System.out.println(new A().a("a"));
	}
}
