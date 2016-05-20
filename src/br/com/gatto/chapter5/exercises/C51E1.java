package br.com.gatto.chapter5.exercises;

/**
 * 1. As op��es (a) e (c) n�o compilam e precisam do casting mesmo com short e
 * char tendo 2 bytes. Na op��o (a), pode ocorrer de o short ser negativo e,
 * portanto, n�o caber no intervalo dos chars. Na op��o (c), o char pode ser
 * muito grande e sair fora do alcance dos positivos do short. Aop��o (b)
 * compila, pois o char que possui 2 bytes pode ser atribu�do para um long que
 * possui 8 bytes.
 *
 */
public class C51E1 {
	private void syso() {
		// short s1 = 10;
		// char c1 = s1;

		char c2 = 10;
		long l = c2;

		// char c3 = 10;
		// short s2 = c3;
	}
}
