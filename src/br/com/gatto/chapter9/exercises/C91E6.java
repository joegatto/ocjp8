package br.com.gatto.chapter9.exercises;

/**
 * 6. A resposta certa é (a). O código não compila pois não existe construtor de
 * B ao qual A tenha acesso para herdar do mesmo.
 */
public class C91E6 extends B91E6 {
	public static void main(String[] args) {
		B91E6 b = B91E6.B91E6("t");
	}
}

class B91E6 {
	// private B91E6() {
	//
	// }

	static B91E6 B91E6(String s) {
		return new B91E6();
	}
}
