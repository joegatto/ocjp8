package br.com.gatto.chapter6.exercises;

import java.util.ArrayList;

/**
 * 3. A resposta certa é (f). O código roda e imprime 1 pois ele remove o
 * primeiro elemento igual ao elemento passado.
 */
public class C63E3 {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<String>();
		c.add("a");
		c.add("a");
		System.out.println(c.remove("a"));
		System.out.println(c.size());
	}
}
