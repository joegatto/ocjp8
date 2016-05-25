package br.com.gatto.chapter9.exercises;

/**
 * 4. A resposta certa é (a). O código não compila pois usa herançamúltipla de
 * classes, que não existe em Java.
 */
//public class C91E4 extends B91E4, A91E4 {
//	public static void main(String[] args) {
//		System.out.println(new A91E4().m(3));
//	}
//}

class B91E4 /* extends A91E3 */ {
	int m(int a) {
		return 1;
	}
}

class A91E4 {
	int m(double b) {
		return 2;
	}
}