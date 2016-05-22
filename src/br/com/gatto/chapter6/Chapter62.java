package br.com.gatto.chapter6;

public class Chapter62 {
	public static void main(String[] args) {
		int[][] table = new int[10][15];
		int[][][] cube = new int[10][][];
		int[][][][] hypercube = new int[10][][][];
		int[][] test = new int[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 1, 1 } };

		System.out.println(test[0][1]);

		int[][] weird = new int[2][];
		weird[0] = new int[20];
		weird[1] = new int[10];
		for (int i = 0; i < weird.length; i++) {
			System.out.println(weird[i].length);
		}
	}
}
