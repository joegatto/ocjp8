package br.com.gatto.chapter6.exercises;

import java.util.ArrayList;

/**
 * 2. A resposta certa é (d). O código roda e imprime true, pois foi removido um
 * elemento da lista.
 */
public class C63E2 {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<String>();
		c.add("a");
		c.add("c");
		System.out.println(c.remove("a"));
	}
}
