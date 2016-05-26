package br.com.gatto.chapter12.exercises;


/**
 * 7. A resposta certa é (b). Imprime 5.
 */
public class C121E7 {

	public static void main(String[] args) {
		int a = Integer.parseInt("10", 2);
		int b = a == 10 ? null : 3;
		System.out.println(a + b);
	}

}
