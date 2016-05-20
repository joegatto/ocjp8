package br.com.gatto.chapter5.exercises;
/**
 * 5. 3. O for externo vai contar de 0 a 5,mas dentro do
 * for tem um if que pré-incrementa o i. Esse if vai quebrar o loop no momento
 * que o valor retornado for divisível por 3, isto é, quando i valer 3 nesse
 * caso.
 */
public class C51E15 {
	public static void main(String[] args) {
		int i;
		for (i = 0; i < 5; i++) {
			if (++i % 3 == 0) {
				break;
			}
		}
		System.out.println(i);
	}
}
