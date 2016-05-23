package br.com.gatto.chapter7.exercises;

/**
 * 1. A resposta certa é (e). O código compila e ao rodar, a não é maior que
 * 100, portanto imprime 10.
 */
public class C71E1 {
	public static void main(String[] args) {
		int a = 10;
		while (a > 100)
			a++;
		System.out.println(a);
	}
}
