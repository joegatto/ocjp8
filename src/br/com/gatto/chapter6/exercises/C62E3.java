package br.com.gatto.chapter6.exercises;

/**
 * 3. A resposta certa é (g). O código compila e imprime 30 normalmente. Não há
 * problema algum em apontar para um novo array.
 */
public class C62E3 {
	public static void main(String[] args) {
		int xyz[][] = new int[3][10];
		int[] x = new int[20];
		int[] y = new int[10];
		int[] z = new int[30];
		xyz[0] = x;
		xyz[1] = y;
		xyz[2] = z;
		System.out.println(xyz[2].length);
	}
}
