package br.com.gatto.chapter9.exercises;

/**
 * 2. A resposta certa � (a). O c�digo n�o compila porque n�o existe this no contexto static.
 */
class C95E2 extends B95E2 {
	static int x = 2;

	public static void main(String[] args) {
		// System.out.println(this.x);
	}
}

class B95E2 {
	int x = 1;
}