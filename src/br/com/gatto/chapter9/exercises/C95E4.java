package br.com.gatto.chapter9.exercises;

/**
 * 4. A resposta certa é (a). O código não compila: não faz sentido acessar o }
 * super de outro objeto que não eu mesmo.
 */
class C95E4 extends B95E4 {
	static int x = 2;

	public static void main(String[] args) {
		// System.out.println(new C95E4().super.x);
	}
}

class B95E4 {
	int x = 1;
}