package br.com.gatto.chapter13.exercises;

import java.util.function.Predicate;

public class C132E6 {
	int a = 0;

	public static void main(String[] args) {
		new C132E6().method(1);
	}

	private void method(int a) {
		// Predicate<Integer> d = a -> a > 0; // A

		// if (d.test(a)) { // B
		// System.out.println(a);
		// }
	}
}
