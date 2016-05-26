package br.com.gatto.chapter10.exercise;

/**
 * 3. A resposta certa é (c). O código compila e imprime ace, jogando uma
 * Exception.
 */
class C104E3 {
	void m2() {
		System.out.println("e");
		int[] x = new int[15];
		x[20] = 13;
		System.out.println("f");
	}

	void m() {
		System.out.println("c");
		m2();
		System.out.println("d");
	}

	public static void main(String[] args) {
		System.out.println("a");
		new C104E3().m();
		System.out.println("b");
	}
}
