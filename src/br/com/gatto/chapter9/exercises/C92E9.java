package br.com.gatto.chapter9.exercises;

import java.io.*;

class B92E9 {
	void x(int i) throws IOException {
		if (i < 0) {
			return;
		}
		// super.x(-1);
		System.out.println("c");
	}
}

abstract class A92E9 extends B92E9 {
	void x(int i) throws IOException {
		System.out.println("b");
		super.x(i);
	}
}

abstract class D92E9 extends A92E9 {
	void x(int i) throws IOException {
		super.x(i);
	}
}

class E92E9 extends D92E9 {
}

/**
 * 9. A resposta certa é (a). Não compila, não existe super.x na classe B.
 */
public class C92E9 {
	public static void main(String[] args) throws IOException {
		new E92E9().x(32);
	}
}
