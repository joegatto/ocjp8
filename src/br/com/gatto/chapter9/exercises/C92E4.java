package br.com.gatto.chapter9.exercises;

import java.io.*;

/**
 * 4. A resposta certa é (a). O código não compila: C não possui método que
 * receba double.
 */
public class C92E4 {
	public static void main(String[] args) throws IOException {
		// new A92E4().x(3.2);
	}
}

class B92E4 {
	void x(double i) throws IOException {
		System.out.println("c");
	}
}

class A92E4 {
	void x(int i) throws FileNotFoundException {
		System.out.println("b");
	}
}
