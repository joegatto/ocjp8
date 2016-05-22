package br.com.gatto.chapter6.exercises;

import java.util.ArrayList;

/**
 * 6. A resposta certa é (b). O código inclui os elementos sempre no final da
 * ArrayList, portanto imprime a e depois d.
 */
public class C63E6 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();

		b.add("a");
		c.add("c");
		b.add("b");
		c.add("d");

		a.addAll(b);
		a.addAll(c);

		System.out.println(a.get(0));
		System.out.println(a.get(3));
	}
}
