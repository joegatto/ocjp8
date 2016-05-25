package br.com.gatto.chapter10.exercise;

/**
 * 2. A resposta certa é (c). Quando ocorre a exception, o fluxo desvia para
 * imprimir “b” e depois continua normal com o “c”.
 */
public class C103E2 {
	public static void main(String[] args) {
		String name = null;
		try {
			name.toLowerCase();
			System.out.println("a");
		} catch (Exception e) {
			System.out.println("b");
		}
		System.out.println("c");
	}
}
