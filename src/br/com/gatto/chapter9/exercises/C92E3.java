package br.com.gatto.chapter9.exercises;

import java.io.*;

/**
 * 3. A resposta certa é (c). O código compila e imprime ‘c‘.
 */
public class C92E3 {
	public static void main(String[] args) throws IOException {
		new A92E3().x(3.2);
	}
}

class B92E3 {
	void x(double i) throws IOException {
		System.out.println("c");
	}
}

class A92E3 extends B92E3 {
	void x(int i) throws FileNotFoundException {
		System.out.println("b");
	}
}
