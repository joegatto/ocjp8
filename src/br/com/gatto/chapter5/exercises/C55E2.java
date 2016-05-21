package br.com.gatto.chapter5.exercises;

/**
 * 2. A resposta certa é (a). O código não compila pois t2 não é uma constante.
 * Somente podemos verificar case de switch em variáveis finais inicializadas
 * diretamente.
 */
public class C55E2 {
	public static void main(String[] args) {
		int t2 = 1;
		int t = args.length;
		switch (t) {
		// case t2:
		// System.out.println("1");
		// break;
		default:
			System.out.println("args???");
		}
	}
}
