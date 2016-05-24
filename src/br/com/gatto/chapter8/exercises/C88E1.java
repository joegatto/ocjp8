package br.com.gatto.chapter8.exercises;

/**
 * 1. A resposta certa é (a). Não compila pois somente variáveis podem ter
 * aplicadas auto increment e auto decremento.
 */
public class C88E1 {
	public static void main(String[] args) {
		int[] i = { 150, 151 };
		i = s(i);
		System.out.println(i[1]);
	}

	static int[] s(int i[]) {
		int[] j = { i[0], i[1] };
		i[1]++;
		return j;
	}
}
