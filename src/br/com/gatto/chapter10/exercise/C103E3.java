package br.com.gatto.chapter10.exercise;

/**
 * 3. A resposta certa é (b). Quando ocorre a exception, o fluxo desvia para
 * imprimir “b”, passa pelo finally imprimindo “c”, e depois continua normal com
 * o “d”.
 */
public class C103E3 {
	public static void main(String[] args) {
		String name = null;
		try {
			name.toLowerCase();
			System.out.println("a");
		} catch (Exception e) {
			System.out.println("b");
		} finally {
			System.out.println("c");
		}
		System.out.println("d");
	}
}
