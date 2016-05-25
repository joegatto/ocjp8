package br.com.gatto.chapter9.exercises;

/**
 * 5. A resposta certa é (c). O código compila e não imprime nada.
 */
public class C91E5 {
	public static void main(String[] args) {
		B91E5 b = B91E5.B91E5("t");
	}
}

class B91E5 {
	private B91E5() {

	}

	static B91E5 B91E5(String s) {
		return new B91E5();
	}
}
