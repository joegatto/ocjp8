package br.com.gatto.chapter3.exercises;

/**
 * 4. A resposta certa � (c), a vari�vel x declarada como par�metro do m�todo
 * main efetua um shadowing. Nesse instante, ao dizermos x = 200, tentamos
 * atribuir um int a um array de String, erro de compila��o.
 */

public class C31E4 {
	static int x = 15;

	public static void main(String[] x) {
		/*
		 * x = 200; - N�o se pode atribuir um valor int para uma variavel String
		 * sem fazer convers�o.
		 */
		System.out.println(x);
	}
}
