package br.com.gatto.chapter9.exercises;

import java.io.*;

class B92E8 {
	void x(int i) throws IOException {
		if (i < 0) {
			return;
		}
		this.x(-1);
		System.out.println("c");
	}
}

abstract class A92E8 extends B92E8 {
	void x(int i) throws IOException {
		System.out.println("b");
		super.x(i);
	}
}

abstract class D92E8 extends A92E8 {
	void x(int i) throws IOException {
		super.x(i);
	}
}

class E92E8 extends D92E8 {
}

/**
 * 8. A resposta certa é (b). Compila e imprime ‘b‘,‘b‘,‘c‘.
 */
public class C92E8 {
	public static void main(String[] args) throws IOException {
		new E92E8().x(32);
	}
}
