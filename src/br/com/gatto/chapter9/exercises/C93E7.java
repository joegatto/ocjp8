package br.com.gatto.chapter9.exercises;

/**
 * 7. A resposta certa é (a). O código não compila pois, ao sobrescrevê-lo,
 * tentamos definir um escopo menor. Não compila também porque o método close é
 * package protected dentro de Account.
 */
public class C93E7 {
	public static void main(String[] args) {
		// new Account().close();
	}
}
