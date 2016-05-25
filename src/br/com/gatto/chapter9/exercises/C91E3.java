package br.com.gatto.chapter9.exercises;

/**
 * 3. A resposta certa é (a). O código não compila pois há um ciclo na herança.
 */
class C91E3 extends B91E3 {
	int m(String c) {
		return 3;
	}

	public static void main(String[] args) {
		System.out.println(new A91E3().m(3));
	}
}

class B91E3 /* extends A91E3 */ {
	int m(int a) {
		return 1;
	}
}

class A91E3 extends C91E3 {
	int m(double b) {
		return 3;
	}
}
