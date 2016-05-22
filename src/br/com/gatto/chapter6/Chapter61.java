package br.com.gatto.chapter6;

public class Chapter61 {
	public static void main(String[] args) {
		int[] ages;
		long[] size;

		double weights[];
		double lengths[];
		long[] size2;

		ages = new int[10];
		lengths = new double[50];

		System.out.println(ages[0]);

		int[] numbers = new int[0];
		// int[] numbers2 = new int[-1];

		int[] numbers3 = new int[] { 1, 2, 5, 7, 5 };

		int[] numbers4 = { 1, 2, 5, 7, 5 };

		ages[0] = 10;

		weights = new double[50];
		weights[49] = 73.14;

		int[] idades = { 33, 30, 13 };

		for (int i = 0; i < idades.length; i++) {
			ages[i] = i;
		}

		for (int i : idades) {
			System.out.println(i);
		}

		Exam[] exams = new Exam[10];
		for (int i = 0; i < exams.length; i++) {
			exams[i] = new Exam();
			exams[i].timeLimit = 210;
		}

		for (Exam exam : exams) {
			System.out.println(exam.timeLimit);
		}

		Exam[] exams1 = new Exam[2];
		exams1[0] = new TheoreticalExam();
		exams1[1] = new PracticalExam();

		String[] values = new String[2];
		values[0] = "Certification";
		values[1] = "Java";

		Object[] vals = values;
		for (Object val : vals) {
			System.out.println(val);
		}

		Object[] values2 = new Object[2];
		values2[0] = "Certification";
		values2[1] = "Java";

		String[] vals2 = (String[]) values2;
		for (Object val : vals2) {
			System.out.println(val);
		}
	}
}

class Exam {
	int timeLimit;
}

class PracticalExam extends Exam {

}

class TheoreticalExam extends Exam {

}