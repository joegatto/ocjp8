package br.com.gatto.chapter8.exercises;

/**
 * 3. A resposta certa é (d). Compila e imprime z.
 */
public class C82E3 {
	public static void main(String[] args) {
		new C82E3().x();
	}

	static void x() {
		new B().y();
	}
}

class B {
	void y() {
		this.z();
	}

	static void z() {
		System.out.println("z");
	}
}
