package br.com.gatto.chapter5.exercises;

/**
 * 4. A resposta certa � (a), 1. Dessa vez, o valor de i ser� usado no if e s�
 * depois incrementado. Como o resto de 0 dividido por qualquer n�mero tamb�m �
 * 0, o for s� executa uma vez. Mas o valor de i ainda ser� incrementado,
 * imprimindo o valor de 1.
 */
public class C51E14 {
	public static void main(String[] args) {
		int i;
		for (i = 0; i < 5; i++) {
			if (i++ % 3 == 0) {
				break;
			}
		}
		System.out.println(i);
	}
}
