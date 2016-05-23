package br.com.gatto.chapter8.exercises;

/**
 * 1. A resposta certa é (a). O código não compila pois existe um return sem
 * valor, e o método x deve retornar um int.
 */
public class C81E1 {
	public static void main(String[] args) {
		x(args.length);
	}

	static int x(final int l) {
		for (int i = 0; i < 100; i++) {
			switch (i) {
			// case l:
			// System.out.println(l);
			// if (l == i)
			// return;
			case 0:
				System.out.println(0);
			}
		}
		System.out.println("end");
		return -1;
	}
}
