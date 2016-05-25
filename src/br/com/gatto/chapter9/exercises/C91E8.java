package br.com.gatto.chapter9.exercises;

/**
 * 8. A resposta certa é (b). Compila e imprime ‘t‘
 */
class C91E8 extends B91E8 {
	public C91E8(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		B91E8 b = C91E8.B91E8("t");
		System.out.println(b.s);
	}
}

class B91E8 {
	protected String s;

	protected B91E8() {
	}

	static C91E8 B91E8(String s) {
		return new C91E8(s);
	}
}
