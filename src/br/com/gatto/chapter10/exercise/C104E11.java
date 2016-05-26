package br.com.gatto.chapter10.exercise;

/**
 * 11. A resposta certa é (c). Compila, e imprime ace e estoura uma Exception.
 */
class C104E11 {
	void m2() throws java.io.FileNotFoundException {
		System.out.println("e");
		boolean sim = true;
		if (sim)
			throw new Exception104E11();
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
		new C104E11().m();
		System.out.println("b");
	}
}

class Exception104E11 extends RuntimeException {

}
