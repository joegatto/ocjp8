package br.com.gatto.chapter11.exercises;

/**
 * 5. A resposta certa é (b). Linhas A e C imprimem abc.
 */
public class C112E5 {
	public static void main(String[] args) {
		System.out.println(new char[] { 'a', 'b', 'c' }); // A
		System.out.println(new byte[] { 'a', 'b', 'c' }); // B
		System.out.println("abc"); // C
		System.out.println(new String[] { "abc" }); // D
	}
}
