package br.com.gatto.chapter10.exercise;

import java.util.ArrayList;

/**
 * 2. A resposta certa é (d). OutOfMemoryError, pois tem um loop infinito.
 */
public class C105E2 {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; i++)
				strings.add("string " + i + " " + j);
		System.out.println(strings.get(99999));
	}
}
