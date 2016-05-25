package br.com.gatto.chapter9.exercises;

import java.io.*;

class B92E6 {
	void x(int i) throws IOException {
		System.out.println("c");
	}
}

abstract class A92E6 extends B92E6 {
	abstract void x(int i) throws IOException;
}

abstract class D92E6 extends A92E6 {
	void x(int i) throws IOException {
		System.out.println("d");
	}
}

class E92E6 extends D92E6 {
}

/**
 * 6. A resposta certa é (d). Compila e imprime ‘d‘
 */
public class C92E6 {
	public static void main(String[] args) throws IOException {
		new E92E6().x(32);
	}
}
