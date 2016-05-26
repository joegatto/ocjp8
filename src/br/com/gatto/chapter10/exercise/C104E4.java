package br.com.gatto.chapter10.exercise;

/**
 * 4. A resposta certa é (a). O código não compila pois o método m2 deve tratar
 * ou jogar java.io.FileNotFoundException.
 */
class C104E4 {
	void m2() {
		System.out.println("e");
		// new java.io.FileInputStream("a.txt");
		System.out.println("f");
	}

	void m() {
		System.out.println("c");
		m2();
		System.out.println("d");
	}

	public static void main(String[] args) {
		System.out.println("a");
		new C104E4().m();
		System.out.println("b");
	}
}
