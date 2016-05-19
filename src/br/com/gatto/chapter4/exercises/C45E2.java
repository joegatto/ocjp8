package br.com.gatto.chapter4.exercises;

/**
 * 2. A resposta certa é (c). O código compila e imprime 2.
 */
class C45E2 {
	public static void main(String[] args) {
		new F().x(23789, 673482);
	}
}

class F {
	void x(int... x) {
		System.out.println(x.length);
	}
}
