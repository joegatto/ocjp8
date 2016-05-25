package br.com.gatto.chapter9.exercises;

/**
 * 7. A resposta certa é (a). O código não compila pois A não tem acesso a
 * variável de B.
 */
class C91E7 extends B91E7 {
	public C91E7(String s) {
		// this.s = s;
	}

	public static void main(String[] args) {
		// B91E7 b = C91E7.B91E7("t");
		// System.out.println(b.s);
	}
}

class B91E7 {
	private String s;

	protected B91E7() {
	}

	// static C91E7 B91E7(String s) {
	// return new C91E7();
	// }
}
