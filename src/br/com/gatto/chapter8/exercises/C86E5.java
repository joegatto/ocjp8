package br.com.gatto.chapter8.exercises;

import br.com.gatto.chapter8.exercises.a.A;

/**
 * 5. A resposta certa � (b). Imprime 1, pois o m�todo que recebe String n�o
 * est� vis�vel no pacote principal.
 *
 */
class C86E5 {
	public static void main(String[] args) {
		System.out.println(new A().a("a"));
	}
}
