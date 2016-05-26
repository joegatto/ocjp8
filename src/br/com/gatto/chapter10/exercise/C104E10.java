package br.com.gatto.chapter10.exercise;

/**
 * 10. A resposta certa é (a). Não compila: a palavra throw deveria ter sido
 * usada para jogar a Exception.
 */
class C104E10 {
	void m2() throws java.io.FileNotFoundException {
		System.out.println("e");
		boolean sim = true;
		if (sim)
			// throws new Exception104E10();
			System.out.println("f");
	}

	void m() throws java.io.FileNotFoundException {
		System.out.println("c");
		try {
			m2();
		} catch (java.io.FileNotFoundException ex) {
		}
		System.out.println("d");
	}

	public static void main(String[] args) throws java.io.IOException {
		System.out.println("a");
		new C104E10().m();
		System.out.println("b");
	}
}

class Exception104E10 extends RuntimeException {

}
