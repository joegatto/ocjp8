package br.com.gatto.chapter5.exercises;

/**
 * 2. A resposta certa � (b). An�lise linha a linha: 
 * � divis�o inteira: i1 vale 1 
 * � divis�o inteira, que depois � promovido a double: i2 vale 1.0 
 * � divis�o double: i3 vale 1.5 
 * � x vale 0L e d vale 0.0 (duas promo��es) 
 * - O resultado � 3.5
 */
public class C51E2 {
	public static void main(String[] args) {
		int i1 = 3 / 2;
		double i2 = 3 / 2;
		double i3 = 3 / 2.0;
		long x = 0;
		double d = 0;
		double zero = x + d;

		System.out.println(i1 + i2 + i3 + x + d + zero);
	}
}
