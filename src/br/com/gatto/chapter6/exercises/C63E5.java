package br.com.gatto.chapter6.exercises;

import java.util.ArrayList;

/**
 * 5. A resposta certa é (a). O código não compila, pois ométodo toArray sem
 * argumentos retorna um array de Object.
 */
public class C63E5 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add(1, "amor");
		l.add(3, "love");
		System.out.println(l);
		// String[] array = l.toArray();
		// System.out.println(array[2]);
	}
}
