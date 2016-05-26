package br.com.gatto.chapter10.exercise;

/**
 * 8. A resposta certa é (b). Compila, e imprime acefdb, note que não jogamos a
 * exception, somente a instanciamos.
 */
class C104E8 {
	void m2() throws java.io.FileNotFoundException {
		System.out.println("e");
		new MyException();
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
		new C104E8().m();
		System.out.println("b");
	}
}

class MyException extends RuntimeException {

}
