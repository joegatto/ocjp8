package br.com.gatto.chapter9.exercises;

import java.io.*;

/**
 * 2. A resposta certa é (b). O código compila e imprime ‘b‘.
 */
public class C92E2 {
	public static void main(String[] args) throws IOException {
		new A92E2().x();
	}
}

class B92E2 {
	void x() throws IOException {
		System.out.println("c");
	}
}

class A92E2 extends B92E2 {
	void x() throws FileNotFoundException {
		System.out.println("b");
	}
}
