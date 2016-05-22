package br.com.gatto.chapter6.exercises;

/**
 * 2. A resposta certa é (f). Na posição 2, temos o array z, que tem 30 casas,
 * portanto temos o resultado 30.
 */
public class C62E2 {
	public static void main(String[] args) {
		int xyz[][] = new int[3][];
		int[] x = new int[20];
		int[] y = new int[10];
		int[] z = new int[30];
		xyz[0] = x;
		xyz[1] = y;
		xyz[2] = z;
		System.out.println(xyz[2].length);
	}
}
