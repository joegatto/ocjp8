package br.com.gatto.chapter9.exercises;

class B95E10 {
	int x() {
		return y();
	}

	int y() {
		return 3;
	}
}

class A95E10 extends B95E10 {
	A95E10() {
		super();
		z(x());
	}

	void z(int i) {
		System.out.println(i);
	}

	int y() {
		return 2;
	}
}

/**
 * 10. A resposta certa é (b). Compila e imprime ‘2‘.
 */
class C95E10 {
	public static void main(String[] args) {
		new A95E10();
	}
}