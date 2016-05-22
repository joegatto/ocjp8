package br.com.gatto.chapter6.exercises;

import java.util.ArrayList;

/**
 * 4. A resposta certa é (h). O código compila e imprime 5.
 */
public class C63E4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("a");
		System.out.println(list.lastIndexOf("b"));
	}
}
