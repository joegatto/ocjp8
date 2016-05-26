package br.com.gatto.chapter10.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 5. A resposta certa é (a). O código não compila pois ométodo main deve tratar
 * ou jogar java.io.IOException.
 */
class C104E5 {
	void m2() throws FileNotFoundException {
		System.out.println("e");
		new java.io.FileInputStream("a.txt");
		System.out.println("f");
	}

	void m() throws IOException {
		System.out.println("c");
		m2();
		System.out.println("d");
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("a");
		// new C104E5().m();
		System.out.println("b");
	}
}
