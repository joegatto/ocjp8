package br.com.gatto.chapter13.exercises;

import java.util.function.Predicate;

public class C132E5 {
	int a = 0;

	public static void main(String[] args) {
		new C132E5().method(1, a -> a > 0); // A
	}

	private void method(int a, Predicate<Integer> d) {
		if (d.test(a)) { // B
			System.out.println(a);
		}
	}
}
