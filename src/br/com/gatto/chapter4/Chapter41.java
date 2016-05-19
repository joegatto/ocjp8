package br.com.gatto.chapter4;

public class Chapter41 {
	public void method() {
		int age;

		age = 10;

		double pi = 3.14;

		System.out.println(age);
	}

	public void method(int a) {
		double x = 0;

		if (a > 1) {
			x = 6;
		}
		
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		// compila pois 737821237891232 é um double válido
		System.out.println(737821237891232d);
		// compila pois 737821237891232 é um long válido
		System.out.println(737821237891232l);
		// não compila pois 737821237891232 é um valor maior que
		// o int aceita
		// System.out.println(737821237891232);
		
		int i = 0761;
		System.out.println(i);
		
		int j = 0xAB3400;
		System.out.println(j);
		
		int b = 0b100001011;
		System.out.println(b);
		
		int a = 123_456_789;
		System.out.println(a);
		
		int v1 = 0_100_267_760; // ok
		// int v2 = 0_x_4_13; // erro, _ antes e depois do x
		// int v3 = 0b_x10_BA_75; // erro, _ depois do b
		// int v4 = 0b_10000_10_11; // erro, _ depois do b
		int v5 = 0xa10_AF_75; // ok, apesar de ser letra
		// int v6 = _123_341; // erro, inicia com _
		// int v7 = 123_432_; // erro, termina com _
		int v8 = 0x1_0A0_11; // ok
		int v9 = 144__21_12; // ok
		
		char sete = 7;
		System.out.println(sete);
		
		System.out.println(v1 + " " + v5 + " " + " " + v8 + " " + v9);
				
	}
}

class Exam {
	double timeLimit;
}
