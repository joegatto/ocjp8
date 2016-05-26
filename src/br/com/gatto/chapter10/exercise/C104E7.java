package br.com.gatto.chapter10.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 7. A resposta certa é (e). Compila, e imprime acedb.
 */
class C104E7 {
	void m2() throws FileNotFoundException {
		System.out.println("e");
		new java.io.FileInputStream("a.txt");
		System.out.println("f");
	}

	void m() throws FileNotFoundException {
		System.out.println("c");
		try {
			m2();
		} catch (FileNotFoundException e) {
		}
		System.out.println("d");
	}

	public static void main(String[] args) throws IOException {
		System.out.println("a");
		new C104E7().m();
		System.out.println("b");
	}
}
