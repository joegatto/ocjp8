package br.com.gatto.chapter4.exercises;

/**
 * 9. A resposta certa é (d). Dá NullPointerException ao tentar criar a segunda
 * String.
 */
public class C47E9 {
	public static void main(String[] args) {
		String s = null;
		String s2 = new String(s);
		System.out.println(s2);
	}
}
