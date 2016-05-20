package br.com.gatto.chapter5.exercises;

/**
 * 1. As opções (a) e (c) não compilam e precisam do casting mesmo com short e
 * char tendo 2 bytes. Na opção (a), pode ocorrer de o short ser negativo e,
 * portanto, não caber no intervalo dos chars. Na opção (c), o char pode ser
 * muito grande e sair fora do alcance dos positivos do short. Aopção (b)
 * compila, pois o char que possui 2 bytes pode ser atribuído para um long que
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
