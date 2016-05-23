package br.com.gatto.chapter7.exercises;

/**
 * 1. A resposta certa é (b). O código compila e imprime false, pois ele sempre
 * entra no laço pelo menos uma vez.
 */
public class C73E1 {
	public static void main(String[] args) {
		boolean i = false;
		do {
			System.out.println(i);
		} while (i);
	}
}
