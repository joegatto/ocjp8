package br.com.gatto.chapter10.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 6. A resposta certa é (c). Compila, imprime ace e joga a Exception.
 */
class C104E6 {
	void m2() throws FileNotFoundException {
		System.out.println("e");
		new java.io.FileInputStream("a.txt");
		System.out.println("f");
	}

	void m() throws FileNotFoundException {
		System.out.println("c");
		m2();
		System.out.println("d");
	}

	public static void main(String[] args) throws IOException {
		System.out.println("a");
		new C104E6().m();
		System.out.println("b");
	}
}
