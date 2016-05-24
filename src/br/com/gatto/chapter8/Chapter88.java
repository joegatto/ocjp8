package br.com.gatto.chapter8;

public class Chapter88 {
	public static void main(String[] args) {
		int i = 2;
		test(i);

		i = 2;
		test2(i);
		System.out.println(i);

		Exam exam = new Exam();
		exam.timeLimit = 100;
		test3(exam);
		System.out.println(exam.timeLimit);

		test4(exam);
		System.out.println(exam.timeLimit);
	}

	private static void test(int i) {
		for (int j = 0; j < i; j++) {
			new String("j = " + j);
		}
	}

	static void test2(int i) {
		i = 3;
	}

	static void test3(Exam exam) {
		exam.timeLimit = 210;
	}

	static void test4(Exam exam) {
		exam = new Exam();
		exam.timeLimit = 520;
	}
}

class Exam {
	double timeLimit = 210;
}