package br.com.gatto.chapter9.exercises;

import java.io.*;

/**
 * 5. A resposta certa é (a). Não compila, pois interface não pode termétodo com
 * corpo da maneira como foi definido aqui.
 *
 */
public class C92E5 {
	public static void main(String[] args) throws IOException {
		new A92E4().x(3);
	}
}

interface B92E5 {
	// void x(double i) throws IOException {
	// System.out.println("c");
	// }
}

class A92E5 implements B92E5 {
	void x(int i) throws FileNotFoundException {
		System.out.println("b");
	}
}
