package br.com.gatto.chapter9.exercises;

/**
 * 3. A resposta certa é (a). O código não compila não existe super no contexto static.
 */
class C95E3 extends B95E3 {
	static int x = 2;

	public static void main(String[] args) {
		// System.out.println(super.x);
	}
}

class B95E3 {
	int x = 1;
}