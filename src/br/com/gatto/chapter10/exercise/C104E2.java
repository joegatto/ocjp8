package br.com.gatto.chapter10.exercise;

/**
 * 2. A resposta certa é (b). O código compila pois ele cria um array de
 * dimensão 2. Ele imprime acefdb.
 * 
 */
class C104E2 {
	void m2() {
		System.out.println("e");
		int[][] x = new int[15][20];
		System.out.println("f");
	}

	void m() {
		System.out.println("c");
		m2();
		System.out.println("d");
	}

	public static void main(String[] args) {
		System.out.println("a");
		new C104E2().m();
		System.out.println("b");
	}
}
