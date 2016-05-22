package br.com.gatto.chapter6.exercises;

/**
 * 5. A resposta certa é (b). Não tenha medo de simular o código na mão. Simule
 * a memória e perceba que dá uma Exception.
 */
public class C61E5 {
	public static void main(String[] args) {
		int x[] = new int[3];
		for (x[1] = x.length - 1; x[0] == 0; x[1]--) {
			x[x[1]] = -5;
			System.out.println(x[1]);
		}
	}
}
