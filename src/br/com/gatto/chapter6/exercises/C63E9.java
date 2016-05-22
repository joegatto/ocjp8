package br.com.gatto.chapter6.exercises;

import java.util.ArrayList;

/**
 * 9. A resposta certa é (c). O código compila e imprime a, b, c, d, pois o laço
 * está alterando o valor referenciado pela variável s, e não o valor contido
 * dentro da nossa ArrayList.
 */
public class C63E9 {
	public static void main(String[] args) {
		ArrayList<String> ss = new ArrayList<String>();
		ss.add("a");
		ss.add("b");
		ss.add("c");
		ss.add("d");

		for (String s : ss) {
			if (s.equals("c"))
				s = "b";
			else if (s.equals("b"))
				s = "c";
		}
		for (String s : ss)
			System.out.println(s);
	}
}
