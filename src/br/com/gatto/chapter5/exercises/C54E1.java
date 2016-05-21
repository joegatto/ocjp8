package br.com.gatto.chapter5.exercises;

/**
 * 1. A resposta certa é (c). O código compila normalmente e imprime 0 caso não
 * seja passado nenhum argumento.
 */
public class C54E1 {
	public static void main(String[] args) {
		if (args.length > 0)
			System.out.println("1 or more");
		else
			System.out.println("0");
	}
}
