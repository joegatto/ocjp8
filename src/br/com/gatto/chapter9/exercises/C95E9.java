package br.com.gatto.chapter9.exercises;

class B95E9 {
	int x() {
		return y();
	}

	int y() {
		return 3;
	}
}

class A95E9 extends B95E9 {
	A95E9() {
		// this(x());
	}

	A95E9(int i) {
		System.out.println(i);
	}

	int y() {
		return 2;
	}
}

/**
 * 9. A resposta certa � (a). N�o compila: n�o podemos referenciar um m�todo de
 * inst�ncia ao invocar um construtor this.
 */
class C95E9 {
	public static void main(String[] args) {
		new A95E9();
	}
}