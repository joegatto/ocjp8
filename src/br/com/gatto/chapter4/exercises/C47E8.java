package br.com.gatto.chapter4.exercises;

/**
 * 8. A resposta certa é (e). Compila e imprime Welcome null.
 */
class C47E8 {
	static String empty;

	public static void main(String[] args) {
		String full = "Welcome " + empty;
		System.out.println(full);
	}
}
