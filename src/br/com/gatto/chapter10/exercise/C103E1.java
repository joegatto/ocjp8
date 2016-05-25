package br.com.gatto.chapter10.exercise;

/**
 * 1. A resposta certa é (a). Ocódigo não compila pois a variável local nunca
 * foi inicializada.
 */
public class C103E1 {
	public static void main(String[] args) {
		String name;
		try {
			// name.toLowerCase();
			System.out.println("a");
		} catch (Exception e) {
			System.out.println("b");
		}
		System.out.println("c");
	}
}
