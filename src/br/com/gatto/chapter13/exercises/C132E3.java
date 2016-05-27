package br.com.gatto.chapter13.exercises;

public class C132E3 {
	public static void main(String[] args) {
		Calculator<Integer> sum = (a, b) -> a + b;
		Calculator<Integer> multiply = (Integer a, Integer b) -> (int) a * b;
		Calculator<Integer> subtract = (a, b) -> {
			return a - b;
		};
		// Calculator<Integer> divide = (int a, int b) -> {
		// return (Integer) a / b;
		// };
	}
}

interface Calculator<T> {
	T function(T a, T b);
}