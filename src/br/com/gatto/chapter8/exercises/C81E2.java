package br.com.gatto.chapter8.exercises;

/**
 * 2. A resposta certa é (a). Não compila, pois a variável l apesar de ser final
 * não é considerada uma constante pelo compilador. Para ser uma constante a
 * variável tem que ser final e ter seu valor atribuído durante a inicialização.
 */
public class C81E2 {
	public static void main(String[] args) {
		x(args.length);
	}

	static int x(final int l) {
		for (int i = 0; i < 100; i++) {
			switch (i) {
			// case l:
			// System.out.println(l);
			// if (l == i)
			// return 3;
			case 0:
				System.out.println(0);
			}
		}
		System.out.println("end");
		return -1;
	}
}
