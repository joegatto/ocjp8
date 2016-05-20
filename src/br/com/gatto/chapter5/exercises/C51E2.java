package br.com.gatto.chapter5.exercises;

/**
 * 2. A resposta certa é (b). Análise linha a linha: 
 * – divisão inteira: i1 vale 1 
 * – divisão inteira, que depois é promovido a double: i2 vale 1.0 
 * – divisão double: i3 vale 1.5 
 * – x vale 0L e d vale 0.0 (duas promoções) 
 * - O resultado é 3.5
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
