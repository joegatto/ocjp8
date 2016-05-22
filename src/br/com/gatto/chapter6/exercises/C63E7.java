package br.com.gatto.chapter6.exercises;

import java.util.ArrayList;

/**
 * 7. A resposta certa é (a). O código não compila, pois a ordem dos parâmetros
 * para o método add é int, String.
 */
public class C63E7 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		// a.add("a", 0);
		// a.add("b", 0);
		// a.add("c", 0);
		// a.add("d", 0);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
	}
}
