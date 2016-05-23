package br.com.gatto.chapter7;

public class Chapter72 {
	public static void main(String[] args) {
		// for (; true;) {
		//
		// }

		// for (int i = 1, j = 2, k = 3; true;) {
		//
		// }

		int a;
		double b;
		boolean c;

		// for (a = 1, b = 2.0, c = true;;) {
		//
		// }

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		for (int num : numbers) { // enhanced for
			System.out.println(num);
		}
	}
}
