package br.com.gatto.chapter9.exercises;

import java.io.*;

class B92E7 {
	void x(int i) throws IOException {
		if (++i < 0) {
			return;
		}
		x(-1);
		System.out.println("c");
	}
}

abstract class A92E7 extends B92E7 {
	void x(int i) throws IOException {
		System.out.println("b");
		super.x(i);
	}
}

abstract class D92E7 extends A92E7 {
	void x(int i) throws IOException {
		super.x(i);
	}
}

class E92E7 extends D92E7 {
}

/**
 * 7. A resposta certa é (g). Compila e entra em loop.
 */
public class C92E7 {
	public static void main(String[] args) throws IOException {
		new E92E7().x(32);
	}
}
