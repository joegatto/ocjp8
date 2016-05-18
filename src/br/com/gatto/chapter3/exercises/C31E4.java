package br.com.gatto.chapter3.exercises;

/**
 * 4. A resposta certa é (c), a variável x declarada como parâmetro do método
 * main efetua um shadowing. Nesse instante, ao dizermos x = 200, tentamos
 * atribuir um int a um array de String, erro de compilação.
 */

public class C31E4 {
	static int x = 15;

	public static void main(String[] x) {
		/*
		 * x = 200; - Não se pode atribuir um valor int para uma variavel String
		 * sem fazer conversão.
		 */
		System.out.println(x);
	}
}
