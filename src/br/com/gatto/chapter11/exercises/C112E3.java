package br.com.gatto.chapter11.exercises;


/**
 * 3. A resposta certa é (c). Compila e executa normalmente.
 */
public class C112E3 {
	public static void main(String[] args) {
		System.out.printf("%s", 12);
		System.out.printf("%d", new Integer(321));
		System.out.printf("%d", (short) (byte) (double) 127);

	}
}
