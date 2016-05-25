package br.com.gatto.chapter9.exercises;

/**
 * 1. A resposta certa é (c). O código compila e imprime 2.
 */
class C95E1 extends B95E1 {
	static int x = 2;

	public static void main(String[] args) {
		System.out.println(x);
	}
}

class B95E1 {
	int x = 1;
}