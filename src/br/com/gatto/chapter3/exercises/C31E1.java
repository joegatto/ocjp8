package br.com.gatto.chapter3.exercises;

/**
 * 1. A resposta certa � (a). A vari�vel i n�o pode ser acessada fora do la�o.
 */

public class C31E1 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		/* System.out.println(i); */
	}
}
