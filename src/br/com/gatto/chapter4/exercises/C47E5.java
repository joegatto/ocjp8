package br.com.gatto.chapter4.exercises;

/**
 * 5. A resposta certa é (e). Compila e imprime Welcome null
 */
public class C47E5 {
	public static void main(String[] args) {
		String empty = null;
		String full = "Welcome " + empty;
		System.out.println(full);
	}
}
