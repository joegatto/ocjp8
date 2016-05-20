package br.com.gatto.chapter5.exercises;

/**
 * 1. A resposta certa é (b). O código compila e imprime true e false.
 */
public class C53E1 {
	public static void main(String[] args) {
		String s1 = "s1";
		String s2 = "s" + "1";
		System.out.println(s1 == s2);
		System.out.println(s1 == ("" + s2));
	}
}
