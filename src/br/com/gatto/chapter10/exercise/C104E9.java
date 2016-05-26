package br.com.gatto.chapter10.exercise;

/**
 * 9. A resposta certa é (a). Não compila: o System.out do f é unreachable.
 */
class C104E9 {
	void m2() throws java.io.FileNotFoundException {
		System.out.println("e");
		throw new MyException1049();
		// System.out.println("f");
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
		new C104E9().m();
		System.out.println("b");
	}
}

class MyException1049 extends RuntimeException {

}
