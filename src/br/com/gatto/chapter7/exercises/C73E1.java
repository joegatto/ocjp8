package br.com.gatto.chapter7.exercises;

/**
 * 1. A resposta certa � (b). O c�digo compila e imprime false, pois ele sempre
 * entra no la�o pelo menos uma vez.
 */
public class C73E1 {
	public static void main(String[] args) {
		boolean i = false;
		do {
			System.out.println(i);
		} while (i);
	}
}
