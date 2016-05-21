package br.com.gatto.chapter5.exercises;

/**
 * 1. A resposta certa é (d). Ao rodar com 5 argumentos, o código imprime +++.
 */
public class C55E1 {
	public static void main(String[] args) {
		int t = args.length;
		switch (t) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		default:
			System.out.println("+++");
		}
	}
}
