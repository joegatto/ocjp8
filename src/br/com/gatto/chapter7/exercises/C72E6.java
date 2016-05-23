package br.com.gatto.chapter7.exercises;

/**
 * 6. A resposta certa é (e). O código compila e imprime 0 1 1 2
 */
public class C72E6 {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++, System.out.println(i)) {
			System.out.println(i);
		}
	}
}
